class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int idx = x , edx = x + k - 1;
        while (idx < edx) {
            for (int index = y ; index < y + k ; index++)
            {
                int temp = grid[idx][index];
                grid[idx][index] = grid[edx][index];
                grid[edx][index] = temp;
            }
            idx++; edx--;
        }
        return grid;
    }
}