class AllowedCellType():
    def __init__(self, cell_dict):
        self.up = cell_dict["u"]
        self.left = cell_dict["l"]
        self.down = cell_dict["d"]
        self.right = cell_dict["r"]