// Last updated: 7/16/2026, 7:55:16 PM
import java.util.*;
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}