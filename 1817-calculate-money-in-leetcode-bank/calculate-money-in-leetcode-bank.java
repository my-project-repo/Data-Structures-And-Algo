class Solution {
    public int totalMoney(int n) {
        int div = n / 7, rem = n % 7, res = 0, k = 0, t = div + 1;
        while (div-- > 0) {
            res += 28 + k;
            k += 7;
        }
        for (int i = 0; i < rem; i++) {
            res += t++;
        }
        return res;
    }
}