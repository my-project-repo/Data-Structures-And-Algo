class Solution {
    public int[] sumZero(int n) {
        int p = 0, i = (n % 2 == 0) ? 1 : 0;
        int[] res = new int[n];
        for (; i <= n / 2; i++) {
            if (i == 0)
                res[p++] = i;
            else {
                res[p++] = i;
                res[p++] = i * -1;
            }
        }
        return res;
    }
}