class CellPrinter():
    def __init__(self):
        pass
    def get_print_string(self, cell_type, row):
        if cell_type == 0:
            if row == 0:
                return "🟫🟫🟫"
            if row == 1:
                return "🟫🟫🟫"
            if row == 2:
                return "🟫🟫🟫"

        if cell_type == 1:
            if row == 0:
                return "🟫🟩🟫"
            if row == 1:
                return "🟫🟩🟫"
            if row == 2:
                return "🟫🟫🟫"

        if cell_type == 2:
            if row == 0:
                return "🟫🟫🟫"
            if row == 1:
                return "🟫🟩🟩"
            if row == 2:
                return "🟫🟫🟫"

        if cell_type == 3:
            if row == 0:
                return "🟫🟫🟫"
            if row == 1:
                return "🟫🟩🟫"
            if row == 2:
                return "🟫🟩🟫"

        if cell_type == 4:
            if row == 0:
                return "🟫🟫🟫"
            if row == 1:
                return "🟩🟩🟫"
            if row == 2:
                return "🟫🟫🟫"

        if cell_type == 5:
            if row == 0:
                return "🟫🟩🟫"
            if row == 1:
                return "🟩🟩🟫"
            if row == 2:
                return "🟫🟫🟫"

        if cell_type == 6:
            if row == 0:
                return "🟫🟩🟫"
            if row == 1:
                return "🟫🟩🟩"
            if row == 2:
                return "🟫🟫🟫"

        if cell_type == 7:
            if row == 0:
                return "🟫🟫🟫"
            if row == 1:
                return "🟫🟩🟩"
            if row == 2:
                return "🟫🟩🟫"

        if cell_type == 8:
            if row == 0:
                return "🟫🟫🟫"
            if row == 1:
                return "🟩🟩🟫"
            if row == 2:
                return "🟫🟩🟫"

        if cell_type == 9:
            if row == 0:
                return "🟫🟫🟫"
            if row == 1:
                return "🟩🟩🟩"
            if row == 2:
                return "🟫🟫🟫"

        if cell_type == 10:
            if row == 0:
                return "🟫🟩🟫"
            if row == 1:
                return "🟫🟩🟫"
            if row == 2:
                return "🟫🟩🟫"

        if cell_type == 0:
            if row == 0:
                return "🟫🟫🟫"
            if row == 1:
                return "🟫🟫🟫"
            if row == 2:
                return "🟫🟫🟫"

        if cell_type == 11:
            if row == 0:
                return "🟫🟩🟫"
            if row == 1:
                return "🟩🟩🟩"
            if row == 2:
                return "🟫🟫🟫"

        if cell_type == 12:
            if row == 0:
                return "🟫🟫🟫"
            if row == 1:
                return "🟩🟩🟩"
            if row == 2:
                return "🟫🟩🟫"

        if cell_type == 13:
            if row == 0:
                return "🟫🟩🟫"
            if row == 1:
                return "🟩🟩🟫"
            if row == 2:
                return "🟫🟩🟫"

        if cell_type == 14:
            if row == 0:
                return "🟫🟩🟫"
            if row == 1:
                return "🟫🟩🟩"
            if row == 2:
                return "🟫🟩🟫"

        if cell_type == 15:
            if row == 0:
                return "🟫🟩🟫"
            if row == 1:
                return "🟩🟩🟩"
            if row == 2:
                return "🟫🟩🟫"

    def get_start(self, line_str):
        return self.__change_middle_char(line_str, "🟦")

    def get_end(self, line_str):
        return self.__change_middle_char(line_str, "🟥")

    def get_start_primitive_format(self, line_str):
        return self.__change_middle_char(line_str, "S")

    def get_end_primitive_format(self, line_str):
        return self.__change_middle_char(line_str, "E")

    def __change_middle_char(self, line_str, char):
        l = list(line_str)
        l[1] = char
        return "".join(l)

    def get_print_string_primitive_format(self, cell_type, row):
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

        if cell_type == 2:
            if row == 0:
                return "XXX"
            if row == 1:
                return "X  "
            if row == 2:
                return "XXX"

        if cell_type == 3:
            if row == 0:
                return "XXX"
            if row == 1:
                return "X X"
            if row == 2:
                return "X X"

        if cell_type == 4:
            if row == 0:
                return "XXX"
            if row == 1:
                return "  X"
            if row == 2:
                return "XXX"

        if cell_type == 5:
            if row == 0:
                return "X X"
            if row == 1:
                return "  X"
            if row == 2:
                return "XXX"

        if cell_type == 6:
            if row == 0:
                return "X X"
            if row == 1:
                return "X  "
            if row == 2:
                return "XXX"

        if cell_type == 7:
            if row == 0:
                return "XXX"
            if row == 1:
                return "X  "
            if row == 2:
                return "X X"

        if cell_type == 8:
            if row == 0:
                return "XXX"
            if row == 1:
                return "  X"
            if row == 2:
                return "X X"

        if cell_type == 9:
            if row == 0:
                return "XXX"
            if row == 1:
                return "   "
            if row == 2:
                return "XXX"

        if cell_type == 10:
            if row == 0:
                return "X X"
            if row == 1:
                return "X X"
            if row == 2:
                return "X X"

        if cell_type == 0:
            if row == 0:
                return "XXX"
            if row == 1:
                return "XXX"
            if row == 2:
                return "XXX"

        if cell_type == 11:
            if row == 0:
                return "X X"
            if row == 1:
                return "   "
            if row == 2:
                return "XXX"

        if cell_type == 12:
            if row == 0:
                return "XXX"
            if row == 1:
                return "   "
            if row == 2:
                return "X X"

        if cell_type == 13:
            if row == 0:
                return "X X"
            if row == 1:
                return "  X"
            if row == 2:
                return "X X"

        if cell_type == 14:
            if row == 0:
                return "X X"
            if row == 1:
                return "X  "
            if row == 2:
                return "X X"

        if cell_type == 15:
            if row == 0:
                return "X X"
            if row == 1:
                return "   "
            if row == 2:
                return "X X"
