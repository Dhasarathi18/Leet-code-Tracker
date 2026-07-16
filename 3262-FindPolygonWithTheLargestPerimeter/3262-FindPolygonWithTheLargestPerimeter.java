// Last updated: 7/16/2026, 7:54:53 PM
import java.util.Arrays;
class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = nums.length - 1; i >= 2; i--) {
            if (sum - nums[i] > nums[i]) {
                return sum;
            }
            sum -= nums[i];
        }
        return -1;
    }
}