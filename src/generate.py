import json

from services.maze_parameters import MazeParameters

def generate(parameters):
    print(parameters)

# Entry point

if __name__ == "__main__":
    with open('input_params.json', 'r') as f:
        json_object = json.load(f)
    params = MazeParameters(json_object)
    generate(params)