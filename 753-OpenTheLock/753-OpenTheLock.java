// Last updated: 7/16/2026, 7:56:36 PM
import java.util.*;
class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if (dead.contains("0000")) return -1;
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        q.add("0000");
        visited.add("0000");
        int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String curr = q.poll();
                if (curr.equals(target)) return steps;
                for (String next : getNeighbors(curr)) {
                    if (!dead.contains(next) && !visited.contains(next)) {
                        q.add(next);
                        visited.add(next);
                    }
                }
            }
            steps++;
        }
        return -1;
    }
    private List<String> getNeighbors(String s) {
        List<String> res = new ArrayList<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < 4; i++) {
            char original = arr[i];
            arr[i] = original == '9' ? '0' : (char)(original + 1);
            res.add(new String(arr));
            arr[i] = original == '0' ? '9' : (char)(original - 1);
            res.add(new String(arr));
            arr[i] = original; 
        }
        return res;
    }
}