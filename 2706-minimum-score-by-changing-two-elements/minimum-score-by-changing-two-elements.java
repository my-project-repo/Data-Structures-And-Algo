class Solution {
    public int minimizeSum(int[] nums) {
        // nums = [1, 2, 3, 4, 100]
        // nums = [1, 2, 3, 99, 100]
        Arrays.sort(nums);
        int n = nums.length;
        return Math.min(nums[n - 1] - nums[2], Math.min(
                nums[n - 2] - nums[1], nums[n - 3] - nums[0]));

    }
}