// Last updated: 7/16/2026, 7:58:28 PM
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
         for (int num : nums) {
            if (set.contains(num)) {
                return true; 
            }
            set.add(num);
        }

        return false; 
    }
}