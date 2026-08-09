// Last updated: 8/9/2026, 8:56:44 AM
1class Solution {
2    public int splitArray(int[] nums, int k) {
3
4        long low = 0;
5        long high = 0;
6
7        for (int num : nums) {
8            low = Math.max(low, num);
9            high += num;
10        }
11
12        while (low < high) {
13
14            long mid = low + (high - low) / 2;
15
16            int parts = 1;
17            long sum = 0;
18
19            for (int num : nums) {
20
21                if (sum + num <= mid) {
22                    sum += num;
23                } else {
24                    parts++;
25                    sum = num;
26                }
27            }
28
29            if (parts > k) {
30                low = mid + 1;
31            } else {
32                high = mid;
33            }
34        }
35
36        return (int) low;
37    }
38}