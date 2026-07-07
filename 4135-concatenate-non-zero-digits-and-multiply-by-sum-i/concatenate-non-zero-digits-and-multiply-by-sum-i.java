class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0, digit = 0;
        int i = 0;
        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                sum = (long) sum + d;
                digit += (long) Math.pow(10, i++) * d;
            }
            n /= 10;
        }

        return sum * digit;
    }
}