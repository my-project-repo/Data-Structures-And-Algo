class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        for (int[] a : grid) {
            for (int i = a.length - 1; i >= 0; i--) {
                if (a[i] >= 0)
                    break;
                res++;
            }
        }
        return res;
    }
}