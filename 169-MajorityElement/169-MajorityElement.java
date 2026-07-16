// Last updated: 7/16/2026, 7:59:01 PM
class Solution {
    public int majorityElement(int[] nums){
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
