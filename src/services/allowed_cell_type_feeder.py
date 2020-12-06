import json
from services.allowed_cell_type import AllowedCellType
from services.dead_cell import DeadCell

class AllowedCellTypeFeeder():
    def __init__(self):
        with open('src/data/cell_types.json', 'r') as f:
            ct = json.load(f)
        self.cell_types = ct
        with open('src/data/type_rules.json', 'r') as f:
            tr = json.load(f)
        self.type_rules = tr
        with open('src/data/continuous_path_of_side_cells.json', 'r') as f:
            cposc = json.load(f)
        self.continuous_path_of_side_cells = cposc

    def get_type(self, cell_type):
        return AllowedCellType(self.cell_types[str(cell_type)])

    def get_allowed_type(self, side, allowed_tile_of_the_side):
        if isinstance(allowed_tile_of_the_side, DeadCell):
            allowed_tile_of_the_side = "w"

        ret = []

        for i, val in self.cell_types.items():
            if (val[side] == allowed_tile_of_the_side):
                ret.append(i)

        return ret

    def get_allowed_by_rate_type(self, rate_type):
        res = self.type_rules[rate_type]
        return res

    def get_allowed_by_continuous_side(self, side):
        return self.continuous_path_of_side_cells[side]

    def get_allowed_types_on_solution_path(self, from_side, to_side):
        # Applying no restriction on None
        from_side = 'all' if not from_side else from_side
        to_side = 'all' if not to_side else to_side

        # Get direction types
        from_directions = self.get_allowed_by_continuous_side(from_side)
        to_directions = self.get_allowed_by_continuous_side(to_side)

        # Intersect two lists
        return self.__get_intersect_values_list(from_directions, to_directions)

    def __get_intersect_values_list(self, l1, l2):
        return list(set(l1) & set(l2))