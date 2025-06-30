class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        int res = 0, left = 0;
        long pro = 1;
        for (int right = 0; right < nums.length; right++) {
            pro *= nums[right];
            while (pro >= k && left < right) {
                pro /= nums[left];
                left++;
            }
            if (pro < k)
            res += (right - left) + 1;
        }
        return res;
    }
}