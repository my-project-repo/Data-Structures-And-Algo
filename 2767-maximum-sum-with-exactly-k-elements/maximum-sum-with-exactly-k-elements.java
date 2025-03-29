class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0],res = 0;
        for (int i : nums)
        max = Math.max(max,i);

        while (k-->0)
        {
            res+=max++;
        }
        return res;
    }
}