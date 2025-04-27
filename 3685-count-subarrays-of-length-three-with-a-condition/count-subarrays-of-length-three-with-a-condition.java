class Solution {
    public int countSubarrays(int[] nums) {
        int mid = 1, window = 0, res = 0, k = 0;
        for (int i = 0; i < 3; i++) {
            window += nums[i];
        }
        if (2 * window == 3 * nums[mid])
            res++;
        for (int i = 3; i < nums.length; i++) {
            window += nums[i];
            window -= nums[k++];
            mid++;
            if (2 * window == 3 * nums[mid])
                res++;
        }
        return res;
    }
}