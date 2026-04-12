class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd = numsDivide[0], count = 0;
        for (int i = 1; i < numsDivide.length; i++) {
            gcd = g(gcd, numsDivide[i]);
        }
        Arrays.sort(nums);
        for (int i : nums) {
            if (gcd % i == 0)
                return count;
            else
                count++;
        }
        return -1;
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