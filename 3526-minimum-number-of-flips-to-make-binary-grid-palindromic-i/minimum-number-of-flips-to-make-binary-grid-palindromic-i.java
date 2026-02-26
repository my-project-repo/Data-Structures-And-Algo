class Solution {
    public int minFlips(int[][] grid) {
        int row = 0, col = 0;
        // row
        for (int [] arr : grid)
        {
            int idx = 0, edx = arr.length-1;
            while (idx < edx)
            {
                if (arr[idx] != arr[edx]) row++;
                idx++; edx--;
            }
        }

        // col
        for (int i = 0;i<grid[0].length;i++)
        {
            int idx = 0, edx = grid.length-1;
            while (idx < edx)
            {
                if (grid[idx][i] != grid[edx][i]) col++;
                idx++; edx--;
            }

        }
        return Math.min(row,col);

    }
}