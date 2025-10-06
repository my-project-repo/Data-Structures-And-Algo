class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return window(nums, goal) - window(nums, goal - 1);
    }

    int window(int[] nums, int k) {
        int l = 0, sum = 0, res = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum > k && l <= r) {
                sum -= nums[l++];
            }
            res += r - l + 1;
        }
        return res;
    }
}