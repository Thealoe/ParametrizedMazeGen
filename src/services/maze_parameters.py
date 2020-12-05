class MazeParameters():
    def __init__(self, params):
        self.parameters = params

    # Rectangle generator

    def get_rectangle_row_count(self):
        return self.parameters['RGen']['RC']

    def get_rectangle_column_count(self):
        return self.parameters['RGen']['CC']

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