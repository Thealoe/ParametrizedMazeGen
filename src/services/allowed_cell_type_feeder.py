import json
from services.allowed_cell_type import AllowedCellType

class AllowedCellTypeFeeder():
    def __init__(self):
        with open('src/data/cell_types.json', 'r') as f:
            json_object = json.load(f)
        self.cell_types = json_object

    def get_type(self, cell_type):
        return AllowedCellType(self.cell_types[str(cell_type)])