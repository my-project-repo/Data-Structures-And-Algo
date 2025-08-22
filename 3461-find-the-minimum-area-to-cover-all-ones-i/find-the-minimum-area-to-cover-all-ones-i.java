class Solution {
    public int minimumArea(int[][] grid) {
        int maxHeight = -1, maxWidth = -1, minHeight = grid.length, minWidth = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxHeight = Math.max(maxHeight, i);
                    maxWidth = Math.max(maxWidth, j);
                    minHeight = Math.min(minHeight, i);
                    minWidth = Math.min(minWidth, j);
                }
            }
        }
        return (maxHeight - minHeight + 1) * (maxWidth - minWidth + 1);
    }
}