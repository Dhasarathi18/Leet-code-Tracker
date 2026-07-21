# Last updated: 7/21/2026, 9:04:12 AM
1from typing import List
2
3class Solution:
4    def isRectangleCover(self, rectangles: List[List[int]]) -> bool:
5        corners = set()
6        area = 0
7
8        min_x = float('inf')
9        min_y = float('inf')
10        max_x = float('-inf')
11        max_y = float('-inf')
12
13        for x1, y1, x2, y2 in rectangles:
14            area += (x2 - x1) * (y2 - y1)
15
16            min_x = min(min_x, x1)
17            min_y = min(min_y, y1)
18            max_x = max(max_x, x2)
19            max_y = max(max_y, y2)
20
21            for point in [(x1, y1), (x1, y2), (x2, y1), (x2, y2)]:
22                if point in corners:
23                    corners.remove(point)
24                else:
25                    corners.add(point)
26
27        expected = {
28            (min_x, min_y),
29            (min_x, max_y),
30            (max_x, min_y),
31            (max_x, max_y)
32        }
33
34        if corners != expected:
35            return False
36
37        return area == (max_x - min_x) * (max_y - min_y)