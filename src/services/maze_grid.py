class MazeGrid():
    def __init__(self, cell_feeder, row_count, col_count):
        self.row_count = row_count
        self.col_count = col_count
        self.cell_feeder = cell_feeder

        print("Row count: {}".format(self.row_count))
        print("Col count: {}".format(self.col_count))

        self.grid = self.__build_start_grid()

    def __build_start_grid(self):
        grid = [[self.cell_feeder.create_new_cell_at(0, x, y) for y in range(0, self.col_count)] for x in range(0, self.row_count)]

        print("Initial grid row count: {}".format(len(grid)))
        print("Initial grid col count: {}".format(len(grid[0])))

        # Attach all cells
        for x in range(0, self.row_count):
            for y in range(0, self.col_count):
                cell = grid[x][y]

                # Attach neighbor cells
                cell.left = self.cell_feeder.create_dead_cell() if (y - 1 == -1) else grid[x][y-1]
                cell.right = self.cell_feeder.create_dead_cell() if (y + 1 == self.col_count) else grid[x][y+1]
                cell.up = self.cell_feeder.create_dead_cell() if (x - 1 == -1) else grid[x-1][y]
                cell.down = self.cell_feeder.create_dead_cell() if (x + 1 == self.row_count) else grid[x+1][y]

                # print("=========================================================")
                # print("Iteration --> x: {} | y: {} ".format(x, y))
                # print("Cell --> x: {} | y: {} ".format(cell.x, cell.y))
                # print("Cell.left --> type: {}".format(type(cell.left).__name__))
                # print("Cell.up --> type: {}".format(type(cell.up).__name__))
                # print("Cell.right --> type: {}".format(type(cell.right).__name__))
                # print("Cell.down --> type: {}".format(type(cell.down).__name__))
                # print("=========================================================")

        return grid

    def at(self, x, y):
        return self.grid[x][y]