class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0] , max = nums[0];
        for (int i = 1 ;i<nums.length;i++)
        {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        while (min != 0)
        {
            int t = min;
            min = max % min;
            max = t;
        }
        return max;
    }
}