class Solution {
    public long getDescentPeriods(int[] p) {
        long res = 1, sum = 1;
        for (int i = 1; i < p.length; i++) {
            if ((p[i-1] - p[i]) == 1)
                sum++;
            else
                sum = 1;
            res += sum;
        }
        return res;
    }
}