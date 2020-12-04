import json

from services.maze_parameters import MazeParameters
from services.maze_grid import MazeGrid
from services.cell_feeder import CellFeeder

def generate(parameters):
    cell_feeder = CellFeeder()
    maze_grid = MazeGrid(cell_feeder, parameters.get_rectangle_row_count(), parameters.get_rectangle_column_count())

# Entry point

if __name__ == "__main__":
    with open('input_params.json', 'r') as f:
        json_object = json.load(f)
    params = MazeParameters(json_object)
    generate(params)