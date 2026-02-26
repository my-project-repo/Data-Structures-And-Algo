class Solution {
    public int minFlips(int[][] grid) {
        int res = 0, counter = 0;
        // row
        for (int [] arr : grid)
        {
            int idx = 0, edx = arr.length-1;
            while (idx < edx)
            {
                if (arr[idx] != arr[edx])
                {
                    counter++;
                }
                idx++; edx--;
            }
        }

        // col
        for (int i = 0;i<grid[0].length;i++)
        {
            int idx = 0, edx = grid.length-1;
            while (idx < edx)
            {
                if (grid[idx][i] != grid[edx][i])
                res++;
                idx++; edx--;
            }

        }
        return Math.min(res,counter);

    }
}