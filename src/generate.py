import json

from services.maze_parameters import MazeParameters
from services.allowed_cell_type_feeder import AllowedCellTypeFeeder
from services.maze_grid import MazeGrid

cell_type_feeder = AllowedCellTypeFeeder()

def generate(parameters):
    maze_grid = MazeGrid(parameters.get_rectangle_row_count(), parameters.get_rectangle_column_count())

# Entry point

if __name__ == "__main__":
    with open('input_params.json', 'r') as f:
        json_object = json.load(f)
    params = MazeParameters(json_object)
    generate(params)