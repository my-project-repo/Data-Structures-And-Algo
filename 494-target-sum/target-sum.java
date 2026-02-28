class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return fun(0, target, nums, nums.length);
    }

    int fun(int i, int sum, int[] arr, int n) {
        if (i == n) return sum == 0 ? 1 : 0;
        return fun(i + 1, sum - arr[i], arr, n) + fun(i + 1, sum + (arr[i]), arr, n);

    }
}