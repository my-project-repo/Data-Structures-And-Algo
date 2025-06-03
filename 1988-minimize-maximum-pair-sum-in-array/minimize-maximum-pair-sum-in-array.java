class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int idx = 0 , edx = nums.length-1, max = -99;
        while (idx < edx)
        {
            max = Math.max(max,nums[idx] + nums[edx]);
            idx++; edx--;
        }
        return max;
    }
}