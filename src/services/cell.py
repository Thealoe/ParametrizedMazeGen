from services.allowed_cell_type_feeder import AllowedCellTypeFeeder
from services.cell_info import CellInfo

class Cell():
    def __init__(self, initial_type, rate_type, allowed_cell_types, x, y):
        self.visited = False
        self.info = CellInfo(initial_type, rate_type, allowed_cell_types)
        self.x = x
        self.y = y
        self.left = None
        self.right = None
        self.up = None
        self.down = None