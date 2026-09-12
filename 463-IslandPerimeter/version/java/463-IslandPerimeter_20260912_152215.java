// Last updated: 12/09/2026, 15:22:15
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int islands = 0, neighbors = 0;
4        for (int i = 0; i < grid.length; i++) {
5            for (int j = 0; j < grid[0].length; j++) {
6                if (grid[i][j] == 1) {
7                    islands++;
8                    if (i > 0 && grid[i-1][j] == 1) neighbors++;
9                    if (j > 0 && grid[i][j-1] == 1) neighbors++;
10                }
11            }
12        }
13        return islands * 4 - neighbors * 2;
14    }
15}
16