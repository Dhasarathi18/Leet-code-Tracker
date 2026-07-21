# Last updated: 7/21/2026, 9:32:00 AM
1from typing import List
2
3class Solution:
4    def maximalRectangle(self, matrix: List[List[str]]) -> int:
5        if not matrix or not matrix[0]:
6            return 0
7
8        cols = len(matrix[0])
9        heights = [0] * (cols + 1)
10        max_area = 0
11
12        for row in matrix:
13            for i in range(cols):
14                if row[i] == "1":
15                    heights[i] += 1
16                else:
17                    heights[i] = 0
18
19            stack = [-1]
20            for i in range(cols + 1):
21                while heights[i] < heights[stack[-1]]:
22                    h = heights[stack.pop()]
23                    w = i - stack[-1] - 1
24                    max_area = max(max_area, h * w)
25                stack.append(i)
26
27        return max_area