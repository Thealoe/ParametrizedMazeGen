import random
import numpy as np

from services.dead_cell import DeadCell
class MazeGrid():
    def __init__(self, cell_feeder, row_count, col_count):
        self.row_count = row_count
        self.col_count = col_count
        self.cell_feeder = cell_feeder
        self.mb_rates = ['e', 's', 't', 'd']
        self.sp_rates = ['s', 't', 'd']
        self.grid = self.__build_start_grid()

    def at(self, x, y):
        return self.grid[x][y]

    def __build_start_grid(self):
        grid = [[self.cell_feeder.create_new_cell_at(0, x, y) for y in range(0, self.col_count)] for x in range(0, self.row_count)]

        # Attach all cells
        for x in range(0, self.row_count):
            for y in range(0, self.col_count):
                cell = grid[x][y]

                # Attach neighbor cells
                cell.left = self.cell_feeder.create_dead_cell() if (y - 1 == -1) else grid[x][y-1]
                cell.right = self.cell_feeder.create_dead_cell() if (y + 1 == self.col_count) else grid[x][y+1]
                cell.up = self.cell_feeder.create_dead_cell() if (x - 1 == -1) else grid[x-1][y]
                cell.down = self.cell_feeder.create_dead_cell() if (x + 1 == self.row_count) else grid[x+1][y]

                # print("=========================================================")
                # print("Iteration --> x: {} | y: {} ".format(x, y))
                # print("Cell --> x: {} | y: {} ".format(cell.x, cell.y))
                # print("Cell.left --> type: {}".format(type(cell.left).__name__))
                # print("Cell.up --> type: {}".format(type(cell.up).__name__))
                # print("Cell.right --> type: {}".format(type(cell.right).__name__))
                # print("Cell.down --> type: {}".format(type(cell.down).__name__))
                # print("=========================================================")

        return grid

    def generate_solution_path(self, straight, turn, decision, start_point, end_point):
        # Get and define start point
        start_cell = self.at(start_point[0], start_point[1])
        start_cell.set_start()

        # Get and define end point
        end_cell = self.at(end_point[0], end_point[1])
        end_cell.set_end()

        # Build rate dictionary
        weights = np.array([straight, turn, decision])
        weights = np.array(weights / np.sum(weights))
        rate_dict = self.__build_weight_dict(weights, self.sp_rates)

        # print("====================================")
        # print("Start cell: {} (x) - {} (y)".format(start_cell.x, start_cell.y))
        # print("End cell: {} (x) - {} (y)".format(end_cell.x, end_cell.y))
        # print("====================================")

        current_cell = start_cell
        prev_direction = None
        visited_cells = []
        while True:
            # Get next cell on solution path
            next_direction, next_cell = self.__get_manhattan_next_cell(current_cell, end_cell)

            # Get allowed direction types
            direction_types = self.cell_feeder.allowed_cell_type_feeder.get_allowed_types_on_solution_path(prev_direction, next_direction)

            # Get possible types based on neighbors
            cell_types = self.__get_next_possible_cell_types(current_cell)

            # Get cell type based on rate probability
            cell_types = self.__get_intersect_values_list(cell_types, direction_types)

            cell_types = self.__get_weighted_cell_type(rate_dict, cell_types)

            if len(cell_types) == 0:
                cell_types = [int(random.choice(direction_types))]

            cell_type = int(random.choice(cell_types))

            # print("====================================")
            # print("Current cell: {} (x) - {} (y)".format(current_cell.x, current_cell.y))
            # print("Next cell: {} (x) - {} (y)".format(next_cell.x, next_cell.y))
            # print("Prev direction: {}".format(prev_direction))
            # print("Next direction: {}".format(next_direction))
            # print("Direction types: {}".format(direction_types))
            # print("Possible cell types: {}".format(cell_types))
            # print("Assigned cell type: {}".format(cell_type))
            # print("====================================")

            # Assign random in the remaining types
            current_cell.info.type = int(random.choice(cell_types))

            # Simulate do-while
            visited_cells.append(current_cell)
            if (current_cell == end_cell):
                break

            prev_direction = self.__convert_next_to_prev_direction(next_direction)
            current_cell = next_cell

        # Mark as visited
        # TODO: This should be able to be done in the first loop, why i doesn't work if so ? Propably a bug..
        for c in visited_cells:
            c.visited = True

    def __get_manhattan_next_cell(self, current, goal):
        distances = {}
        cells = {'l': current.left, 'u': current.up, 'r': current.right, 'd': current.down}

        # Calculate manhattan
        if cells['l'].is_open(): distances['l'] = abs(current.left.x - goal.x) + abs(current.left.y - goal.y)
        if cells['u'].is_open(): distances['u'] = abs(current.up.x - goal.x) + abs(current.up.y - goal.y)
        if cells['r'].is_open(): distances['r'] = abs(current.right.x - goal.x) + abs(current.right.y - goal.y)
        if cells['d'].is_open(): distances['d'] = abs(current.down.x - goal.x) + abs(current.down.y - goal.y)

        # Shuffle in case of equality
        l = list(distances.items())
        random.shuffle(l)
        distances = dict(l)

        min_key = min(distances, key=distances.get)
        return min_key, cells[min_key]

    def generate_forced_pattern(self, forced_cells):
        for c in forced_cells:
            cell = self.at(c.x, c.y)
            cell.info.type = int(c.cell_type)
            cell.visited = True

    def generate_sequential_body(self, end, straight, turn, decision):
        # Build rate dictionary
        weights = np.array([end, straight, turn, decision])
        weights = np.array(weights / np.sum(weights))
        rate_dict = self.__build_weight_dict(weights, self.mb_rates)

        for x in range(0, self.row_count):
            for y in range(0, self.col_count):
                cell = self.at(x, y)
                if (cell.visited == False):
                    cell_types = self.__get_next_possible_cell_types(cell)
                    cell_types = self.__get_weighted_cell_type(rate_dict, cell_types)
                    cell_type = int(random.choice(cell_types))
                    cell.info.type = cell_type

                    # print("=========================================================")
                    # print("Iteration --> x: {} | y: {} ".format(x, y))
                    # print("Cell --> x: {} | y: {} ".format(cell.x, cell.y))
                    # print("Cell.info.allowed.left --> type: {}".format(left_of_cell))
                    # print("Cell.info.allowed.up --> type: {}".format(up_of_cell))
                    # print("Cell.info.allowed.right --> type: {}".format(right_of_cell))
                    # print("Cell.info.allowed.down --> type: {}".format(down_of_cell))
                    # print("Weight dict: {}".format(rate_dict))
                    # print("Allowed type list: {}".format(available_type_integers))
                    # print("=========================================================")

    # Gives all the cell types possibilities of a given cell validating with neighbor cells
    def __get_next_possible_cell_types(self, cell):
        available_types = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"]

        # Left
        left_of_cell = cell.left if isinstance(cell.left, DeadCell) else available_types if cell.left.visited == False else cell.left.info.allowed.right
        a = self.cell_feeder.allowed_cell_type_feeder.get_allowed_type("l", left_of_cell)
        if a: available_types = self.__get_intersect_values_list(available_types, a)

        # Up
        up_of_cell = cell.up if isinstance(cell.up, DeadCell) else available_types if cell.left.visited == False else cell.up.info.allowed.down
        a = self.cell_feeder.allowed_cell_type_feeder.get_allowed_type("u", up_of_cell)
        if a: available_types = self.__get_intersect_values_list(available_types, a)

        # Right
        right_of_cell = cell.right if isinstance(cell.right, DeadCell) else available_types if cell.left.visited == False else cell.right.info.allowed.left
        a = self.cell_feeder.allowed_cell_type_feeder.get_allowed_type("r", right_of_cell)
        if a: available_types = self.__get_intersect_values_list(available_types, a)

        # Down
        down_of_cell = cell.down if isinstance(cell.down, DeadCell) else available_types if cell.left.visited == False else cell.down.info.allowed.up
        a = self.cell_feeder.allowed_cell_type_feeder.get_allowed_type("d", down_of_cell)
        if a: available_types = self.__get_intersect_values_list(available_types, a)

        return available_types

    def __build_weight_dict(self, w, all_rates):
        res = {}
        w_i = 0
        for i in all_rates:
            res[i] = w[w_i]
            w_i += 1
        return res

    # Return a cell type based on available type and a rate random decision based on weights
    def __get_weighted_cell_type(self, rate_dict, available_type_integers):
        print("================")
        print(available_type_integers)
        res = []
        attempts = 0
        while not res:
            if attempts == 1000:
                res = available_type_integers
                break
            res = self.__get_weighted_cell_type_internal(rate_dict, available_type_integers)
            if res:
                if len(res) > 0:
                    break
            attempts += 1
        return res

    def __get_weighted_cell_type_internal(self, rate_dict, available_type_integers):
        sorted_rate_dict = {k: v for k, v in sorted(rate_dict.items(), key=lambda item: item[1])}
        next_d = self.__next_decision(sorted_rate_dict)
        rate_types = self.cell_feeder.allowed_cell_type_feeder.get_allowed_by_rate_type(next_d)
        intersect = self.__get_intersect_values_list(available_type_integers, rate_types)
        return intersect

    def __next_decision(self, sorted_rates):
        rand_float = random.random()
        sum_prop = 0
        for i, prop in sorted_rates.items():
            if rand_float <= prop + sum_prop: return i
            sum_prop += prop

    def __get_intersect_values_list(self, l1, l2):
        return list(set(l1) & set(l2))

    def __convert_next_to_prev_direction(self, direction):
        res = None
        if direction == "l": res = "r"
        if direction == "r": res = "l"
        if direction == "u": res = "d"
        if direction == "d": res = "u"
        return res