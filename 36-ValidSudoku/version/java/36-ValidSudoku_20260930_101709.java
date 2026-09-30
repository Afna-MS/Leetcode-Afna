// Last updated: 30/09/2026, 10:17:09
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] rows = new boolean[9][9];
4        boolean[][] cols = new boolean[9][9];
5        boolean[][] boxes = new boolean[9][9];
6        for (int i = 0; i < 9; i++) {
7            for (int j = 0; j < 9; j++) {
8                if (board[i][j] == '.') continue;
9                int num = board[i][j] - '1';
10                int box = (i / 3) * 3 + j / 3;
11                if (rows[i][num] || cols[j][num] || boxes[box][num]) {
12                    return false;
13                }
14                rows[i][num] = true;
15                cols[j][num] = true;
16                boxes[box][num] = true;
17            }
18        }
19
20        return true;
21    }
22}