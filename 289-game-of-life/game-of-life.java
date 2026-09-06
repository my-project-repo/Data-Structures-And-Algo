class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] temp = new int[m][n];
        int[][] dir = {
                { 0, 1 },
                { 1, 0 },
                { 0, -1 },
                { -1, 0 },
                { -1, 1 },
                { 1, -1 },
                { -1, -1 },
                { 1, 1 }
        };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int counter = 0;
                for (int[] d : dir) // 8
                {
                    int nr = i + d[0];
                    int nc = j + d[1];
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                        continue;
                    if (board[nr][nc] == 1)
                        counter++;
                }
                temp[i][j] = counter;
            }
        }

        for (int i = 0;i<m;i++)
        {
            for (int j = 0;j<n;j++)
            {
                int c = temp[i][j];
                if (board[i][j] == 1)
                {
                    if (c < 2 || c > 3)
                    board[i][j] = 0;
                } else if (c == 3)
                board[i][j] = 1;
            }
        }

    }
}