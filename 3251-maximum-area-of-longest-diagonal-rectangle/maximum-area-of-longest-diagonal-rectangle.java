class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = -99, l = 0, w = 0 , maxArea = 0;
        for (int[] dimension : dimensions) {
             l = dimension[0];
             w = dimension[1];
             int sum = (l * l) + (w * w);
            if (sum > max || (sum == max && l * w > maxArea)) {
                max = sum;
                maxArea = l * w;
            }
        }
        return maxArea;
    }
}