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
                    c_line = self.__print_internal()(cell.info.type, l)
                    if cell.is_start and l == 1: c_line = self.__print_start_internal()(c_line)
                    if cell.is_end and l == 1: c_line = self.__print_end_internal()(c_line)
                    line += c_line
                print(line)

    def __print_internal(self):
        if self.pretty: return self.cell_printer.get_print_string
        else: return self.cell_printer.get_print_string_primitive_format

    def __print_start_internal(self):
        if self.pretty: return self.cell_printer.get_start
        else: return self.cell_printer.get_start_primitive_format

    def __print_end_internal(self):
        if self.pretty: return self.cell_printer.get_end
        else: return self.cell_printer.get_end_primitive_format