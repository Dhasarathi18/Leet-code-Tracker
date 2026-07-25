// Last updated: 7/25/2026, 9:35:24 AM
1import java.util.*;
2class Solution {
3    public boolean isValid(String code) {
4        Stack<String> stack = new Stack<>();
5        int i = 0;
6        int n = code.length();
7        while (i < n) {
8            if (i > 0 && stack.isEmpty()) return false;
9
10            if (code.startsWith("<![CDATA[", i)) {
11                if (stack.isEmpty()) return false;
12
13                int j = code.indexOf("]]>", i);
14                if (j == -1) return false;
15
16                i = j + 3;
17            } 
18            else if (code.startsWith("</", i)) {
19                int j = code.indexOf(">", i);
20                if (j == -1) return false;
21                String tag = code.substring(i + 2, j);
22                if (!isValidTag(tag)) return false;
23                if (stack.isEmpty() || !stack.pop().equals(tag))
24                    return false;
25
26                i = j + 1;
27            } 
28            else if (code.startsWith("<", i)) {
29                int j = code.indexOf(">", i);
30                if (j == -1) return false;
31                String tag = code.substring(i + 1, j);
32                if (!isValidTag(tag)) return false;
33                stack.push(tag);
34                i = j + 1;
35            } 
36            else {
37                i++;
38            }
39        }
40        return stack.isEmpty();
41    }
42    private boolean isValidTag(String tag) {
43        if (tag.length() < 1 || tag.length() > 9)
44            return false;
45
46        for (char c : tag.toCharArray()) {
47            if (c < 'A' || c > 'Z')
48                return false;
49        }
50        return true;
51    }
52}