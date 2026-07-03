class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return slidingWindow(nums, goal) - slidingWindow(nums, goal - 1);
    }

    int slidingWindow(int[] nums, int goal) {
        int l = 0, max = 0, sum = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (l <= r && sum > goal) {
                sum -= nums[l++];
            }

            max += r - l + 1;
        }

        return max;
    }
}