class Solution {
    public int minimumCost(int[] nums) {
        int min1, min2, idx = 0;
        min1 = min2 = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (min1 > nums[i])
            {
                min1 = nums[i];
                idx = i;
            }
        }
        for (int i = 1;i<nums.length;i++)
        {
            if (i == idx) continue;
            min2 = Math.min(min2,nums[i]);
        }
        return nums[0] + min1 + min2;
    }
}