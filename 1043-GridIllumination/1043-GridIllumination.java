// Last updated: 7/16/2026, 7:56:14 PM
class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        java.util.HashMap<Integer, Integer> row = new java.util.HashMap<>();
        java.util.HashMap<Integer, Integer> col = new java.util.HashMap<>();
        java.util.HashMap<Integer, Integer> diag = new java.util.HashMap<>();
        java.util.HashMap<Integer, Integer> anti = new java.util.HashMap<>();
        java.util.HashSet<Long> set = new java.util.HashSet<>();

        for (int[] lamp : lamps) {
            int r = lamp[0];
            int c = lamp[1];
            long key = ((long) r << 32) | (c & 0xffffffffL);

            if (set.contains(key)) {
                continue;
            }

            set.add(key);
            row.put(r, row.getOrDefault(r, 0) + 1);
            col.put(c, col.getOrDefault(c, 0) + 1);
            diag.put(r - c, diag.getOrDefault(r - c, 0) + 1);
            anti.put(r + c, anti.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];

        int[] dr = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

        for (int i = 0; i < queries.length; i++) {
            int r = queries[i][0];
            int c = queries[i][1];

            if (row.getOrDefault(r, 0) > 0 ||
                col.getOrDefault(c, 0) > 0 ||
                diag.getOrDefault(r - c, 0) > 0 ||
                anti.getOrDefault(r + c, 0) > 0) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }

            for (int k = 0; k < 9; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                    continue;
                }

                long key = ((long) nr << 32) | (nc & 0xffffffffL);

                if (!set.contains(key)) {
                    continue;
                }

                set.remove(key);

                row.put(nr, row.get(nr) - 1);
                if (row.get(nr) == 0) row.remove(nr);

                col.put(nc, col.get(nc) - 1);
                if (col.get(nc) == 0) col.remove(nc);

                diag.put(nr - nc, diag.get(nr - nc) - 1);
                if (diag.get(nr - nc) == 0) diag.remove(nr - nc);

                anti.put(nr + nc, anti.get(nr + nc) - 1);
                if (anti.get(nr + nc) == 0) anti.remove(nr + nc);
            }
        }

        return ans;
    }
}