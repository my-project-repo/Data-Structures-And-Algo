class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int l = 0, res = 0;
        for (int r = 0; r < nums.length; r++) {
            while ((r - l + 1 >= 3) && !isAS(l, r, nums)) {
                l++;
            }
            if (r - l + 1 >= 3)
                res += ((r - l + 1) - 3) + 1;
        }

        return res;
    }

    boolean isAS(int l, int r, int[] nums) {
        int cd = nums[l + 1] - nums[l];
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] - nums[i - 1] != cd)
                return false;
        }

        return true;
    }
}