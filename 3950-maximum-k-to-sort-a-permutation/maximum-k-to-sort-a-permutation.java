class Solution {
    public int sortPermutation(int[] nums) {
        int ans = -99;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (ans == -99)
                    ans = nums[i];
                else
                    ans &= nums[i];
            }
        }

        return ans == -99 ? 0 : ans;
    }
}