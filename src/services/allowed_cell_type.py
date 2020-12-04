class AllowedCellType():
    def __init__(self, cell_dict):
        self.allowed_up = cell_dict["u"]
        self.allowed_left = cell_dict["l"]
        self.allowed_down = cell_dict["d"]
        self.allowed_right = cell_dict["r"]