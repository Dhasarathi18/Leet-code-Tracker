# Last updated: 7/16/2026, 7:54:59 PM
class Solution:
    def areaOfMaxDiagonal(self, dimensions):
        max_diagonal = 0
        max_area = 0
        for length, width in dimensions:
            diagonal = length * length + width * width
            area = length * width
            if diagonal > max_diagonal:
                max_diagonal = diagonal
                max_area = area
            elif diagonal == max_diagonal:
                max_area = max(max_area, area)
        return max_area