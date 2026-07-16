// Last updated: 7/16/2026, 7:57:41 PM
import java.util.*;
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        StringBuilder result = new StringBuilder();
        for (char c : list) {
            for (int i = 0; i < map.get(c); i++) {
                result.append(c);
            }
        }
        return result.toString();
    }
}