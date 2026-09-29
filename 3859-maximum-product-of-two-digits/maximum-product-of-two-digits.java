class Solution {
    public int maxProduct(int n) {
        int first, second;
        first = second = Integer.MIN_VALUE;
        while (n > 0) {
            int val = n % 10;
            if (val > first) {
                second = first;
                first = val;
            } else if (val > second) {
                second = val;
            }

            n /= 10;
        }

        return first * second;
    }
}