class Solution {
    public int findPeakElement(int[] nums) {
        // bruteForce
        int res = 0,max = Integer.MIN_VALUE;
        for (int i = 0;i<nums.length;i++)
        {
            if (max < nums[i])
            {
                max = nums[i];
                res = i;
            }
        }
        return res;
    }
}