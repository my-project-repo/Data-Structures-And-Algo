class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd = numsDivide[0], count = 0 , min = Integer.MAX_VALUE;
        for (int i = 1; i < numsDivide.length; i++) {
            gcd = g(gcd, numsDivide[i]);
        }
        for (int i : nums)
        {
            if (gcd % i == 0) min = Math.min(min,i);
        }
        if (min == Integer.MAX_VALUE) return -1;
        for (int i : nums)
        {
            if (i < min) count++;
        }
        return count;
    }

    int g(int x, int y) {
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        return x;
    }
}