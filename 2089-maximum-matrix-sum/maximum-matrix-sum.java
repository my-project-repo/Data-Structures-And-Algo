class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long res = 0, min = Integer.MAX_VALUE;
        int neg = 0;
        for (int[] a : matrix) {
            for (int i : a) {
                if (i < 0) {
                    neg++;
                }
                int val = Math.abs(i);
                res += val;
                min = Math.min(min, val);
            }
        }
        return (neg % 2 == 0) ? res : res - min * 2;
    }
}