// Last updated: 11/08/2026, 16:04:06
class Solution {
    public int[][] transpose(int[][] A) {
        int m = A.length, n = A[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                res[j][i] = A[i][j];
        return res;
    }
}
