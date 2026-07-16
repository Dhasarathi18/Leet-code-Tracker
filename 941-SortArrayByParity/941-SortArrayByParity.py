# Last updated: 7/16/2026, 7:56:27 PM
class Solution:
    def sortArrayByParity(self, nums):
        even = []
        odd = []
        for num in nums:
            if num % 2 == 0:
                even.append(num)
            else:
                odd.append(num)
        return even + odd