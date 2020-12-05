import random
import numpy as np

from services.dead_cell import DeadCell
class MazeGrid():
    def __init__(self, cell_feeder, row_count, col_count):
        self.row_count = row_count
        self.col_count = col_count
        self.cell_feeder = cell_feeder
        self.rates = ['e', 's', 't', 'd']

        print("Row count: {}".format(self.row_count))
        print("Col count: {}".format(self.col_count))

        self.grid = self.__build_start_grid()

    def at(self, x, y):
        return self.grid[x][y]

    def __build_start_grid(self):
        grid = [[self.cell_feeder.create_new_cell_at(0, x, y) for y in range(0, self.col_count)] for x in range(0, self.row_count)]

        print("Initial grid row count: {}".format(len(grid)))
        print("Initial grid col count: {}".format(len(grid[0])))

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

    def random_generate_body(self):
        pass

    def sequential_generate_body(self, end, straight, turn, decision):
        weights = np.array([end, straight, turn, decision])
        weights = np.array(weights / np.sum(weights))
        rate_dict = self.__build_weight_dict(weights)

        for x in range(0, self.row_count):
            for y in range(0, self.col_count):
                cell = self.at(x, y)
                if (cell.visited == False):
                    available_type_integers = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"]

                    # Left
                    left_of_cell = cell.left if isinstance(cell.left, DeadCell) else available_type_integers if cell.left.visited == False else cell.left.info.allowed.right
                    a = self.cell_feeder.allowed_cell_type_feeder.get_allowed_type("l", left_of_cell)
                    if a: available_type_integers = self.__get_intersect_values_list(available_type_integers, a)

                    # Up
                    up_of_cell = cell.up if isinstance(cell.up, DeadCell) else available_type_integers if cell.left.visited == False else cell.up.info.allowed.down
                    a = self.cell_feeder.allowed_cell_type_feeder.get_allowed_type("u", up_of_cell)
                    if a: available_type_integers = self.__get_intersect_values_list(available_type_integers, a)

                    # Right
                    right_of_cell = cell.right if isinstance(cell.right, DeadCell) else available_type_integers if cell.left.visited == False else cell.right.info.allowed.left
                    a = self.cell_feeder.allowed_cell_type_feeder.get_allowed_type("r", right_of_cell)
                    if a: available_type_integers = self.__get_intersect_values_list(available_type_integers, a)

                    # Down
                    down_of_cell = cell.down if isinstance(cell.down, DeadCell) else available_type_integers if cell.left.visited == False else cell.down.info.allowed.up
                    a = self.cell_feeder.allowed_cell_type_feeder.get_allowed_type("d", down_of_cell)
                    if a: available_type_integers = self.__get_intersect_values_list(available_type_integers, a)

                    cell_type = int(self.__get_cell_type(rate_dict, available_type_integers))
                    cell.info.type = cell_type

                    print("=========================================================")
                    print("Iteration --> x: {} | y: {} ".format(x, y))
                    print("Cell --> x: {} | y: {} ".format(cell.x, cell.y))
                    print("Cell.info.allowed.left --> type: {}".format(left_of_cell))
                    print("Cell.info.allowed.up --> type: {}".format(up_of_cell))
                    print("Cell.info.allowed.right --> type: {}".format(right_of_cell))
                    print("Cell.info.allowed.down --> type: {}".format(down_of_cell))
                    print("Weight dict: {}".format(rate_dict))
                    print("Allowed type list: {}".format(available_type_integers))
                    print("=========================================================")

    def __build_weight_dict(self, w):
        res = {}
        w_i = 0
        for i in self.rates:
            res[i] = w[w_i]
            w_i += 1
        return res

    def __get_cell_type(self, rate_dict, available_type_integers):
        res = []
        while not res:
            res = self.__get_cell_type_internal(rate_dict, available_type_integers)
        return random.choice(res)

    def __get_cell_type_internal(self, rate_dict, available_type_integers):
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