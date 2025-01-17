import json
import sys, getopt
from os import path

from services.maze_parameters import MazeParameters
from services.maze_grid import MazeGrid
from services.cell_feeder import CellFeeder
from services.maze_grid_printer import MazeGridPrinter

MDE_FILE = 'mde/mde_workspace/MazeT/model/maze_output.json'
SECOND_FILE = 'input_params.json'

def generate(parameters, pretty):
    cell_feeder = CellFeeder()
    maze_grid_printer = MazeGridPrinter(pretty)
    maze_grid = MazeGrid(cell_feeder, parameters.get_rectangle_row_count(), parameters.get_rectangle_column_count())

    # Generate forced pattern
    fp_cells = parameters.get_force_pattern_cells()
    maze_grid.generate_forced_pattern(fp_cells)

    # Generate solution path
    sp_sr = parameters.get_solution_path_straight_rate()
    sp_tr = parameters.get_solution_path_turn_rate()
    sp_dr = parameters.get_solution_path_decision_rate()
    sp_sp = parameters.get_solution_path_start_point()
    sp_ep = parameters.get_solution_path_end_point()
    maze_grid.generate_solution_path(sp_sr, sp_tr, sp_dr, sp_sp, sp_ep)

    # Generate maze body
    mb_er = parameters.get_maze_body_end_rate()
    mb_sr = parameters.get_maze_body_straight_rate()
    mb_tr = parameters.get_maze_body_turn_rate()
    mb_dr = parameters.get_maze_body_decision_rate()
    maze_grid.generate_sequential_body(mb_er, mb_sr, mb_tr, mb_dr)

    maze_grid_printer.print_grid_to_console(maze_grid)

# Entry point

if __name__ == "__main__":
    print("Generation started ...")
    param_file = MDE_FILE if path.exists(MDE_FILE) else SECOND_FILE
    pretty = True

    # Read options
    opts, args = getopt.getopt(sys.argv,"hi:o:",["pretty="])
    if "pretty=False" in args:
        pretty = False

    print("Using in put file: {}".format(param_file))
    with open(param_file, 'r') as f:
        json_object = json.load(f)
    params = MazeParameters(json_object)
    generate(params, pretty)