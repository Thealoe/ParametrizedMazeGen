import json

class CellRateTypeFeeder():
    def __init__(self):
        with open('src/data/cell_types.json', 'r') as f:
            json_object = json.load(f)
        self.cell_types = json_object

    def get_rate_type(self, cell_type):
        return self.cell_types[str(cell_type)]["rate"]