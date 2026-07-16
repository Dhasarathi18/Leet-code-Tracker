// Last updated: 7/16/2026, 7:54:55 PM
import java.util.HashMap ;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Long> map = new HashMap<>();
        long prefix = 0;
        long ans = Long.MIN_VALUE;
        boolean found = false;
        for (int num : nums) {
            if (map.containsKey(num - k)) {
                ans = Math.max(ans, prefix + num - map.get(num - k));
                found = true;
            }
            if (map.containsKey(num + k)) {
                ans = Math.max(ans, prefix + num - map.get(num + k));
                found = true;
            }
            map.put(num, Math.min(map.getOrDefault(num, Long.MAX_VALUE), prefix));
            prefix += num;
        }
        return found ? ans : 0;
    }
}