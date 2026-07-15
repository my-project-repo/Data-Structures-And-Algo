class Solution {
    public int gcdOfOddEvenSums(int n) {
        if (n == 1) return 1;
        int odd = n * n, even = odd + n;
        while (even > 0) {
            int t = even % odd;
            odd = even;
            even = t;
        }
        return odd;
    }
}