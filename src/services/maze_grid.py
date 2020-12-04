class MazeGrid():
    def __init__(self, cell_feeder, row_count, col_count):
        self.row_count = row_count
        self.col_count = col_count
        self.cell_feeder = cell_feeder
        self.grid = self.__build_start_grid()
        print("Row count: {}".format(self.row_count))
        print("Col count: {}".format(self.col_count))
        print(self.grid)

    def __build_start_grid(self):
        grid = [[self.cell_feeder.create_new_cell_at(0, x, y) for x in range(self.col_count)] for y in range(self.row_count)]
        return grid