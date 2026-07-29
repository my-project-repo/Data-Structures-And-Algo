class Solution {
    Integer[][] dp;

    public int splitArray(int[] nums, int k) {
        dp = new Integer[nums.length + 1][k + 1];
        return partition(0, nums, k);
    }

    int partition(int i, int[] nums, int k) {
        if (k == 1) {
            int s2 = 0;
            for (int j = i; j < nums.length; j++) {
                s2 += nums[j];
            }
            return s2;
        } else if (dp[i][k] != null)
            return dp[i][k];
        else {
            int sum = 0;
            int ans = Integer.MAX_VALUE;
            for (int j = i; j <= nums.length - k; j++) {
                sum += nums[j];
                int remSum = partition(j + 1, nums, k - 1);
                ans = Math.min(ans, Math.max(sum, remSum));
            }

            return dp[i][k] = ans;

        }
    }
}