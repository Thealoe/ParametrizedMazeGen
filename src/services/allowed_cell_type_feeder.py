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

    def get_type(self, cell_type):
        return AllowedCellType(self.cell_types[str(cell_type)])

    def get_allowed_type(self, side, allowed_tile_of_the_side):
        if isinstance(allowed_tile_of_the_side, DeadCell):
            return None

        ret = []

        for i, val in self.cell_types.items():
            if (val[side] == allowed_tile_of_the_side):
                ret.append(i)

        return ret