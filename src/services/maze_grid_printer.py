from services.cell_printer import CellPrinter

class MazeGridPrinter():
    def __init__(self, pretty=True):
        self.cell_printer = CellPrinter()
        self.pretty = pretty

    def print_grid_to_console(self, maze_grid):
        for x in range(0, maze_grid.row_count):
            for l in range(0, 3):
                line = ""
                for y in range(0, maze_grid.col_count):
                    cell = maze_grid.at(x, y)
                    line += self.__print_internal()(cell.info.type, l)
                print(line)

    def __print_internal(self):
        if self.pretty: return self.cell_printer.get_print_string
        else: return self.cell_printer.get_print_string_primitive_format