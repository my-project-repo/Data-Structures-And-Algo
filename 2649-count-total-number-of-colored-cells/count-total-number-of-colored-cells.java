class Solution {
    public long coloredCells(int n) {
        long sum = 1;
        int p = 0;
        for (int i = 1;i<=n;i++)
        {
            sum += 4 * p++;
        }
        return sum;
    }
}