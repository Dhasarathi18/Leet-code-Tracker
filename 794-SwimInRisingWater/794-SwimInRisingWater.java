// Last updated: 7/16/2026, 7:56:31 PM
class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int left = grid[0][0];
        int right = n * n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            boolean[][] visited = new boolean[n][n];
            if (canReach(grid, 0, 0, mid, visited)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canReach(int[][] grid, int r, int c, int t, boolean[][] visited) {
        int n = grid.length;
        if (r < 0 || c < 0 || r >= n || c >= n ||
            visited[r][c] || grid[r][c] > t) {
            return false;
        }
        if (r == n - 1 && c == n - 1) {
            return true;
        }
        visited[r][c] = true;
        return canReach(grid, r + 1, c, t, visited) ||
               canReach(grid, r - 1, c, t, visited) ||
               canReach(grid, r, c + 1, t, visited) ||
               canReach(grid, r, c - 1, t, visited);
    }
}