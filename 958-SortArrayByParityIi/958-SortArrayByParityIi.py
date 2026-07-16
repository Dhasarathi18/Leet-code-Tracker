# Last updated: 7/16/2026, 7:56:22 PM
class Solution:
    def sortArrayByParityII(self, nums):
        n = len(nums)
        ans = [0] * n
        even = 0
        odd = 1
        for num in nums:
            if num % 2 == 0:
                ans[even] = num
                even += 2
            else:
                ans[odd] = num
                odd += 2
        return ans