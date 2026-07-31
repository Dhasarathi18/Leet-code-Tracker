// Last updated: 7/31/2026, 9:50:52 AM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.trim().split("\\s+");
4        StringBuilder ans = new StringBuilder();
5
6        for (int i = words.length - 1; i >= 0; i--) {
7            ans.append(words[i]);
8            if (i != 0) {
9                ans.append(" ");
10            }
11        }
12
13        return ans.toString();
14    }
15}