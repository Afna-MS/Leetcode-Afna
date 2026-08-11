// Last updated: 11/08/2026, 16:15:43
class Solution {
    public int uniquePathsWithObstacles(int[][] g) {
        int m = g.length;
        int n = g[0].length;
        int dp[][] = new int[m][n];
        if (g[0][0] == 1) 
            return 0;
        else 
            dp[0][0] = 1;
        for (int j = 1; j < n; j++) {
            if (g[0][j] == 0) 
                dp[0][j] = dp[0][j - 1];
        }
        for (int i = 1; i < m; i++) {
            if (g[i][0] == 0)
                dp[i][0] = dp[i - 1][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (g[i][j] == 1) {
                    dp[i][j] = 0; 
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1]; 
    }
}