class Solution {
    public int countServers(int[][] grid) {
        int r = grid.length, c = grid[0].length, ans = 0;
        int[] row = new int[r];
        int[] col = new int[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                row[i] += grid[i][j];
            }
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                col[i] += grid[j][i];
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1 &&
                        (row[i] > 1 || col[j] > 1)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}