class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum % 2 != 0) return false;
        Boolean[][] dp = new Boolean[nums.length + 1][(sum / 2) + 1];
        return fun(0, sum / 2, nums, dp);

    }

    boolean fun(int i, int target, int[] arr, Boolean[][] dp) {
        if (i == arr.length) {
            return target == 0;
        }
        if (arr[i] > target)
            return fun(i + 1, target, arr, dp); // skip;
        if (dp[i][target] != null)
            return dp[i][target];
        return dp[i][target] = fun(i + 1, target - arr[i], arr, dp) || fun(i + 1, target, arr, dp);
    }
}