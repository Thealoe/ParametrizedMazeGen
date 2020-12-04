from services.allowed_cell_type_feeder import AllowedCellTypeFeeder
from services.cell_rate_type_feeder import CellRateTypeFeeder
from services.cell import Cell

class CellFeeder():
    def __init__(self):
        self.allowed_cell_type_feeder = AllowedCellTypeFeeder()
        self.cell_rate_type_feeder = CellRateTypeFeeder()

    def create_new_cell_at(self, cell_type, x, y):
        allowed = self.allowed_cell_type_feeder.get_type(cell_type)
        rate_type = self.cell_rate_type_feeder.get_rate_type(cell_type)
        return Cell(cell_type, rate_type, allowed, x, y)