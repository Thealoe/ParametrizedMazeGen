import json

from services.maze_parameters import MazeParameters
from services.maze_grid import MazeGrid
from services.cell_feeder import CellFeeder
from services.maze_grid_printer import MazeGridPrinter

def generate(parameters):
    cell_feeder = CellFeeder()
    maze_grid = MazeGrid(cell_feeder, parameters.get_rectangle_row_count(), parameters.get_rectangle_column_count())

    maze_grid.sequential_generate_body(parameters.get_maze_body_end_rate(), parameters.get_maze_body_straight_rate(), parameters.get_maze_body_turn_rate(), parameters.get_maze_body_decision_rate())

    maze_grid_printer = MazeGridPrinter()
    maze_grid_printer.print_grid_to_console(maze_grid)

# Entry point

if __name__ == "__main__":
    with open('input_params.json', 'r') as f:
        json_object = json.load(f)
    params = MazeParameters(json_object)
    generate(params)