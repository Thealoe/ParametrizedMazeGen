# ParametrizedMazeGen

A tool to generate parametrized maze.

## Version

Python 3.8.6

## Create virtualenv

OS X:

```bash
python3 -m venv maze-env
```

Windows:

```bash
virtualenv --python "<path/to/python>" maze-env
where python # Get python path
```

## Activate virtualenv

OS X:

```bash
source maze-env/bin/activate
```

Windows:

```bash
.\maze-env\Scripts\activate
```

## Install requirements

```bash
pip3 install -r requirements.txt
pip install -r requirements.txt
```

## Generate

```bash
python src/generate.py # Default pretty=True
python src/generate.py pretty=True
python src/generate.py pretty=False # For Windows
```

## Model-driven Engineering

This makes reference to the _mde_ folder.

### Set up with build-in workspace

1. Create Epsilion Interim workspace on the folder mde/mde_workspace
2. Import > General > Existing Projects into Workspace, select Maze
3. Import > General > Existing Projects into Workspace, select MazeT
4. Right-click on Maze/metamodel/Maze.ecore > Register EPackages
5. Right-click on Maze/metamodel/Maze.ecore > Eugenia > Generate GMF editor

### Set up into a separate workspace

Import > General > Archive File > Select mde/archive/mde_project.zip
