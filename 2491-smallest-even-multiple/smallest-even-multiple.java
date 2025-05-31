class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0)
            return lcm(2, n, n);
        return 2 * n;
    }

    int lcm(int x, int y, int temp) {
        if (y == 0)
            return 2 * temp / x;
        return lcm(y, x % y, temp);
    }
}