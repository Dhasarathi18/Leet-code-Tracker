// Last updated: 7/31/2026, 9:47:04 AM
1class Solution {
2    public int minimumMoves(String s) {
3        int count = 0;
4        int i = 0;
5
6        while (i < s.length()) {
7            if (s.charAt(i) == 'X') {
8                count++;
9                i += 3; 
10            } else {
11                i++;
12            }
13        }
14
15        return count;
16    }
17}