class MazeParameters():
    def __init__(self, params):
        self.parameters = params

    def get_rectangle_row_count(self):
        return self.parameters['RGen']['RC']

    def get_rectangle_column_count(self):
        return self.parameters['RGen']['CC']

    def get_solution_path_straight_rate(self):
        return self.parameters['SPGen']['SR']

    def get_solution_path_turn_rate(self):
        return self.parameters['SPGen']['TR']

    def get_solution_path_decision_rate(self):
        return self.parameters['SPGen']['DR']

    def get_maze_body_straight_rate(self):
        return self.parameters['MBGen']['SR']

    def get_maze_body_turn_rate(self):
        return self.parameters['MBGen']['TR']

    def get_maze_body_decision_rate(self):
        return self.parameters['MBGen']['DR']