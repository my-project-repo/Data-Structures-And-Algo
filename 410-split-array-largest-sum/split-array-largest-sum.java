class Solution {
    public int splitArray(int[] nums, int k) {
        int idx = 0, edx = 0, ans = 0;
        for (int i : nums) {
            idx = Math.max(idx, i);
            edx += i;
        }

        while (idx <= edx) {
            int guess = (edx + idx) / 2;
            if (isPossible(guess, nums, k)) {
                ans = guess;
                edx = guess - 1;
            } else
                idx = guess + 1;
        }

        return ans;

    }

    boolean isPossible(int ans, int[] nums, int k) {
        int c = 1, sum = 0;
        for (int i : nums) {
            if (sum + i > ans) {
                c++;
                sum = 0;
            }
            sum += i;

        }
        return c <= k;
    }
}