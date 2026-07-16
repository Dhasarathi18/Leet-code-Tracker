// Last updated: 7/16/2026, 7:55:01 PM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] maxCol = new int[n];
        for (int j = 0; j < n; j++) {
            maxCol[j] = 0;
            for (int i = 0; i < m; i++) {
                maxCol[j] = Math.max(maxCol[j], matrix[i][j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxCol[j];
                }
            }
        }
        return matrix;
    }
}