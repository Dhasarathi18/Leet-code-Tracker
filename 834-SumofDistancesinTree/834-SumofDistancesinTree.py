# Last updated: 7/21/2026, 9:37:03 AM
1from typing import List
2from collections import defaultdict
3
4class Solution:
5    def sumOfDistancesInTree(self, n: int, edges: List[List[int]]) -> List[int]:
6        graph = defaultdict(list)
7
8        for u, v in edges:
9            graph[u].append(v)
10            graph[v].append(u)
11
12        count = [1] * n
13        ans = [0] * n
14
15        def postorder(node, parent):
16            for child in graph[node]:
17                if child != parent:
18                    postorder(child, node)
19                    count[node] += count[child]
20                    ans[node] += ans[child] + count[child]
21
22        def preorder(node, parent):
23            for child in graph[node]:
24                if child != parent:
25                    ans[child] = ans[node] - count[child] + (n - count[child])
26                    preorder(child, node)
27
28        postorder(0, -1)
29        preorder(0, -1)
30
31        return ans