class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0;
        int idx = 0 , edx = nums.length-1;
        while (idx <= edx)
        {
            if (idx == edx)
            res += nums[idx];
            else
            {
                int len = (int) Math.log10(nums[edx]) + 1;
                res += (int)(nums[idx] * Math.pow(10,len)) + nums[edx];
            }
            idx++;
            edx--;
        }
        return res;
    }
}