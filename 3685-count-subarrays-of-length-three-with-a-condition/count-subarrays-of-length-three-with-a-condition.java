class Solution {
    public int countSubarrays(int[] nums) {
        // sliding window of fixed size ( 3 )
        int mid = 1, window = 0, res = 0, k = 0;
        for (int i = 0; i < 3; i++) {
            window += nums[i];
        }
        if (window == 1.5 * nums[mid])
            res++;
        for (int i = 3; i < nums.length; i++) {
            window += nums[i];
            window -= nums[k++];
            mid++;
            if (window == 1.5 * nums[mid])
                res++;
        }
        return res;
    }
}