class Solution {
    public int dominantIndex(int[] nums) {
        int max = -999, idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                idx = i;
            }
        }
        for (int i : nums) {
            if (max == i)
                continue;
            if (i > max / 2)
                return -1;
        }
        return idx;
    }
}