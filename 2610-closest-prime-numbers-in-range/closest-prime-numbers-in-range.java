class Solution {
    public int[] closestPrimes(int left, int right) {
        int min = Integer.MAX_VALUE, first = -99;
        int[] res = { -1, -1 };
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                if (first != -99 && i - first < min) {
                    res[0] = first;
                    res[1] = i;
                    min = i - first;
                }
                first = i;
            }
        }
        return res;
    }

    boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}