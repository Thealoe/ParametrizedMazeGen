from services.cell_param import CellParam

class MazeParameters():
    def __init__(self, params):
        self.parameters = params

    # Rectangle generator

    def get_rectangle_row_count(self):
        return self.parameters['RGen']['RC']

    def get_rectangle_column_count(self):
        return self.parameters['RGen']['CC']

    # Force pattern generator

    def get_force_pattern_cells(self):
        ret = []
        for c in self.parameters['FPGen']['mazeCells']:
            ret.append(CellParam(c['type'], c['point'][0], c['point'][1]))
        return ret


    # Solution path generator

    def get_solution_path_straight_rate(self):
        return self.parameters['SPGen']['SR']

    def get_solution_path_turn_rate(self):
        return self.parameters['SPGen']['TR']

    def get_solution_path_decision_rate(self):
        return self.parameters['SPGen']['DR']

    def get_solution_path_start_point(self):
        return self.parameters['SPGen']['SP']

    def get_solution_path_end_point(self):
        return self.parameters['SPGen']['EP']

    # Maze body generator

    def get_maze_body_end_rate(self):
        return self.parameters['MBGen']['ER']

    def get_maze_body_straight_rate(self):
        return self.parameters['MBGen']['SR']

    def get_maze_body_turn_rate(self):
        return self.parameters['MBGen']['TR']

    def get_maze_body_decision_rate(self):
        return self.parameters['MBGen']['DR']