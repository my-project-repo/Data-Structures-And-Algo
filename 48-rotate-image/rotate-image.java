class Solution {
    public void rotate(int[][] matrix) {
         int r = matrix.length, col = matrix[0].length;
        // transpose
        for (int i =0;i<r-1;i++)
        {
            for (int j = i+1;j<col;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // mirror
        for (int i =0;i<r;i++)
        {
            for (int j = 0;j<col/2;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][col-j-1];
                matrix[i][col-j-1] = temp;
            }
        }
        
    }
}