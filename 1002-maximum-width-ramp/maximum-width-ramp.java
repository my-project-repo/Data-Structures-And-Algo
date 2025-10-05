class Solution {
    public int maxWidthRamp(int[] nums) {
        int[] maxRight = new int[nums.length];
        int max = -9999, idx = 0, j = 1, res = 0, n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(nums[i], max);
            maxRight[i] = max;
        }
        while (idx <= j && idx < n && j < n) {
            if (nums[idx] <= maxRight[j]) {
                res = Math.max(j - idx, res);
                j++;
            } else
                idx++;
        }
        return res;

    }
}