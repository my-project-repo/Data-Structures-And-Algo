class Solution {
    static final long MOD = 1_000_000_007L;

    public int sumDecoded(long[] nums) {
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            long width = nums[i] % 10;
            long d = nums[i] / 10;
            long placeholder = 1;
            long temp = d;

            int digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            for (int j = 0; j < digits - width; j++) {
                placeholder *= 10;
            }

            long y = d % placeholder;
            long x = d / placeholder;
            ans = (ans + power(x, y, MOD)) % MOD;
        }
        return (int) ans;
    }
    long power(long x, long y, long MOD) {

    long result = 1;

    while (y > 0) {

        if (y % 2 == 1) {
            result = (result * x) % MOD;
        }

        x = (x * x) % MOD;
        y /= 2;
    }

    return result;
}
}