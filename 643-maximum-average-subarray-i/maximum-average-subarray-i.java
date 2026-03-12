class Solution {
    public double findMaxAverage(int[] nums, int k) {
         double res = 0.0;
        int sum = 0;
        for (int i = 0;i<k;i++)
        {
            sum += nums[i];
        }
        res = sum * 1.0 / k;
        for (int i = k ;i < nums.length;i++)
        {
            sum += nums[i];
            sum -= nums[i-k];
            res = Math.max(res,sum * 1.0 / k);
        }
        return res;
    }
}