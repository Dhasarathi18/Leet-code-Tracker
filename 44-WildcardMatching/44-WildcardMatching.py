# Last updated: 7/21/2026, 9:45:29 AM
1class Solution:
2    def isMatch(self, s: str, p: str) -> bool:
3        i = j = 0
4        star = -1
5        match = 0
6
7        while i < len(s):
8            if j < len(p) and (p[j] == s[i] or p[j] == '?'):
9                i += 1
10                j += 1
11            elif j < len(p) and p[j] == '*':
12                star = j
13                match = i
14                j += 1
15            elif star != -1:
16                j = star + 1
17                match += 1
18                i = match
19            else:
20                return False
21
22        while j < len(p) and p[j] == '*':
23            j += 1
24
25        return j == len(p)