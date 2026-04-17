class Solution {
    public int smallestValue(int n) {

        while (true) {
            int x = sum(n);
            if (x == n)
                break;
            n = x;
        }
        return n;

    }

    int sum(int n) {
        int sum = 0, i;
        for (i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }
        return n > 1 ? sum + n : sum;
    }
}