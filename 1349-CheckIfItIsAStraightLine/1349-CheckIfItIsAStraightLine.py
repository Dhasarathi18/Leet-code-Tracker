# Last updated: 7/16/2026, 7:55:33 PM
class Solution:
    def checkStraightLine(self, coordinates):
        x1, y1 = coordinates[0]
        x2, y2 = coordinates[1]
        dx = x2 - x1
        dy = y2 - y1
        for x, y in coordinates[2:]:
            if dy * (x - x1) != dx * (y - y1):
                return False
        return True  