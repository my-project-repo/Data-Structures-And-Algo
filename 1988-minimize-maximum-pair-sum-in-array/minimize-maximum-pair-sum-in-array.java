class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int idx = 0, edx = nums.length - 1, max = Integer.MIN_VALUE;
        while (idx < edx) {
            max = Math.max(max, nums[idx] + nums[edx]);
            idx++;
            edx--;
        }
        return max;
    }
}