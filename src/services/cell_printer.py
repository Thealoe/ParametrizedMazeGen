class CellPrinter():
    def __init__(self):
        pass
    def get_print_string(self, cell_type, row):
        if cell_type == 0:
            if row == 0:
                return "XXX"
            if row == 1:
                return "XXX"
            if row == 2:
                return "XXX"

        if cell_type == 1:
            if row == 0:
                return "X X"
            if row == 1:
                return "X X"
            if row == 2:
                return "XXX"