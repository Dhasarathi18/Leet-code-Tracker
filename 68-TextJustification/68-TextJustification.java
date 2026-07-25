// Last updated: 7/25/2026, 9:40:00 AM
1import java.util.*;
2
3class Solution {
4    public List<String> fullJustify(String[] words, int maxWidth) {
5        List<String> result = new ArrayList<>();
6        int i = 0;
7        while (i < words.length) {
8            int j = i;
9            int lineLength = 0;
10            while (j < words.length &&
11                   lineLength + words[j].length() + (j - i) <= maxWidth) {
12                lineLength += words[j].length();
13                j++;
14            }
15            int gaps = j - i - 1;
16            StringBuilder line = new StringBuilder();
17            if (j == words.length || gaps == 0) {
18                for (int k = i; k < j; k++) {
19                    line.append(words[k]);
20                    if (k < j - 1)
21                        line.append(" ");
22                }
23                while (line.length() < maxWidth)
24                    line.append(" ");
25            }
26            else {
27                int totalSpaces = maxWidth - lineLength;
28                int spaceEach = totalSpaces / gaps;
29                int extraSpaces = totalSpaces % gaps;
30                for (int k = i; k < j; k++) {
31                    line.append(words[k]);
32                    if (k < j - 1) {
33                        for (int s = 0; s < spaceEach; s++)
34                            line.append(" ");
35
36                        if (extraSpaces > 0) {
37                            line.append(" ");
38                            extraSpaces--;
39                        }
40                    }
41                }
42            }
43
44            result.add(line.toString());
45            i = j;
46        }
47        return result;
48    }
49}