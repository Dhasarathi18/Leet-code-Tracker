# Last updated: 7/21/2026, 9:11:36 AM
1class Solution:
2    def getMaxRepetitions(self, s1: str, n1: int, s2: str, n2: int) -> int:
3        if n1 == 0:
4            return 0
5
6        recall = {}
7        s1_count = 0
8        s2_count = 0
9        index = 0
10
11        while True:
12            s1_count += 1
13
14            for ch in s1:
15                if ch == s2[index]:
16                    index += 1
17                    if index == len(s2):
18                        s2_count += 1
19                        index = 0
20
21            if s1_count == n1:
22                return s2_count // n2
23
24            if index in recall:
25                prev_s1_count, prev_s2_count = recall[index]
26
27                pre_loop_s1 = prev_s1_count
28                pre_loop_s2 = prev_s2_count
29
30                in_loop_s1 = s1_count - prev_s1_count
31                in_loop_s2 = s2_count - prev_s2_count
32
33                break
34            else:
35                recall[index] = (s1_count, s2_count)
36
37        result = pre_loop_s2
38
39        remaining_s1 = n1 - pre_loop_s1
40        result += (remaining_s1 // in_loop_s1) * in_loop_s2
41
42        rest = remaining_s1 % in_loop_s1
43
44        index = list(recall.keys())[list(recall.values()).index((pre_loop_s1, pre_loop_s2))]
45
46        for _ in range(rest):
47            for ch in s1:
48                if ch == s2[index]:
49                    index += 1
50                    if index == len(s2):
51                        result += 1
52                        index = 0
53
54        return result // n2