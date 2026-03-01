class Solution {
    int dp[][];
    int s;

    public int findTargetSumWays(int[] nums, int target) {
        s = 0;
        for (int i : nums)
            s += i;
        dp = new int[nums.length][s * 2 + 1];
        return fun(0, target, nums, nums.length);
    }

    int fun(int i, int sum, int[] arr, int n) {
        if (sum < -s || sum > s)
            return 0;
        if (i == n)
            return sum == 0 ? 1 : 0;
        if (dp[i][s + sum] != 0)
            return dp[i][s + sum];
        int res = fun(i + 1, sum + arr[i], arr, n) + fun(i + 1, sum - (arr[i]), arr, n);
        dp[i][s + sum] = res;
        return res;
    }
}