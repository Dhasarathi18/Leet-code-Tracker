# Last updated: 7/21/2026, 9:16:04 AM
1class Solution:
2    def reversePairs(self, nums):
3        def mergeSort(left, right):
4            if left >= right:
5                return 0
6
7            mid = (left + right) // 2
8            count = mergeSort(left, mid) + mergeSort(mid + 1, right)
9
10            j = mid + 1
11            for i in range(left, mid + 1):
12                while j <= right and nums[i] > 2 * nums[j]:
13                    j += 1
14                count += j - (mid + 1)
15
16            temp = []
17            i, j = left, mid + 1
18
19            while i <= mid and j <= right:
20                if nums[i] <= nums[j]:
21                    temp.append(nums[i])
22                    i += 1
23                else:
24                    temp.append(nums[j])
25                    j += 1
26
27            while i <= mid:
28                temp.append(nums[i])
29                i += 1
30
31            while j <= right:
32                temp.append(nums[j])
33                j += 1
34
35            nums[left:right + 1] = temp
36            return count
37
38        return mergeSort(0, len(nums) - 1)