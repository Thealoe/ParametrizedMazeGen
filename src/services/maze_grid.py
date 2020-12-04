class MazeGrid():
    def __init__(self, row_count, col_count):
        self.row_count = row_count
        self.col_count = col_count

        self.grid = self.__build_start_grid()
        print("Row count: {}".format(self.row_count))
        print("Col count: {}".format(self.col_count))
        print(self.grid)

    def __build_start_grid(self):
        return None