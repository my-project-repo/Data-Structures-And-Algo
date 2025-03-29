class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int x = m , y = n;
        for (int [] arr : ops)
        {
            x = Math.min(x,arr[0]);
            y = Math.min(y,arr[1]);
        }
        return x * y;
    }
}