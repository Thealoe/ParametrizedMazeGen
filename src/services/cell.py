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

        # Start and end
        self.is_start = False
        self.is_end = False

    def set_start(self):
        self.is_start = True

    def set_end(self):
        self.is_end = True

    def is_open(self):
        return not self.visited