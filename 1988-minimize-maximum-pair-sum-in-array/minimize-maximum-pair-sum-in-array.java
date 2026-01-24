class Solution {
    
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int idx = 0, edx = nums.length - 1, max = Integer.MIN_VALUE;
        while (idx < edx) {
            int sum = nums[idx] + nums[edx];
            max = Math.max(max, sum);
            idx++;
            edx--;
        }
        return max;
    }
}