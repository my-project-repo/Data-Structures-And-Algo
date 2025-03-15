class Solution {
    public int minCapability(int[] nums, int k) {
        int ans = 0, start = Integer.MAX_VALUE, end = Integer.MIN_VALUE;
        for (int i : nums) {
            start = Math.min(start, i);
            end = Math.max(end, i);
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (helper(mid, nums, k)) {
                ans = mid;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return ans;

    }

    private boolean helper(int mid, int[] nums, int k) {
        int minRob = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= mid) {
                minRob++;
                i++;
            }
            if (minRob >= k)
                return true;
        }
        return false;
    }
}