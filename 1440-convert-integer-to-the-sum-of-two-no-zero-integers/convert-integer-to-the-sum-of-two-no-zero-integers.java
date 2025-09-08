class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i <= n / 2; i++) {
            int l = i;
            int r = n - l;
            if (doesHaveZero(l) && doesHaveZero(r))
                return new int[] { l, r };
        }
        return new int[] {};
    }

    boolean doesHaveZero(int n) {
        while (n != 0) {
            if (n % 10 == 0)
                return false;
            n /= 10;
        }
        return true;
    }
}