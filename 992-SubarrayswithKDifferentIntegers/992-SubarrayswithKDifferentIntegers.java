// Last updated: 8/9/2026, 9:00:49 AM
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        
4        return atMost(nums, k) - atMost(nums, k - 1);
5    }
6
7    private int atMost(int[] nums, int k) {
8        
9        if (k == 0) {
10            return 0;
11        }
12
13        int[] freq = new int[nums.length + 1];
14
15        int left = 0;
16        int distinct = 0;
17        int count = 0;
18
19        for (int right = 0; right < nums.length; right++) {
20
21            if (freq[nums[right]] == 0) {
22                distinct++;
23            }
24
25            freq[nums[right]]++;
26
27            while (distinct > k) {
28                freq[nums[left]]--;
29
30                if (freq[nums[left]] == 0) {
31                    distinct--;
32                }
33
34                left++;
35            }
36
37            count += right - left + 1;
38        }
39
40        return count;
41    }
42}