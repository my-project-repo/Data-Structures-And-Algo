class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long res = 0, min = Integer.MAX_VALUE;
        int neg = 0;
        for (int[] a : matrix) {
            for (int i : a) {
                if (i < 0) {
                    neg++;
                    i *= -1;
                }
                res += i;
                min = Math.min(min, i);
            }
        }
        return (neg % 2 == 0) ? res : res - min * 2;
    }
}