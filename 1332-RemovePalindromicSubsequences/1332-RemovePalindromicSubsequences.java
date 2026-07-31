// Last updated: 7/31/2026, 9:45:15 AM
1class Solution {
2    public int removePalindromeSub(String s) {
3        int i = 0;
4        int j = s.length() - 1;
5
6        while (i < j) {
7            if (s.charAt(i) != s.charAt(j)) {
8                return 2;
9            }
10            i++;
11            j--;
12        }
13
14        return 1;
15    }
16}
17