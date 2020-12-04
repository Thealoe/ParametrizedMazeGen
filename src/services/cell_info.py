class CellInfo():
    def __init__(self, initial_type, rate_type, allowed_cell_types):
        self.type = initial_type
        self.rate_type = rate_type
        self.allowed = allowed_cell_types