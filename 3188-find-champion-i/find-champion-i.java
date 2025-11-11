class Solution {
    public int findChampion(int[][] grid) {
        int res = 0, one, max = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            one = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    one++;
            }
            if (one > max) {
                max = one;
                res = i;
            }
        }
        return res;
    }
}