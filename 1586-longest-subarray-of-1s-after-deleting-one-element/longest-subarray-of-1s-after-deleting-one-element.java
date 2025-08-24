class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0, zero = 0, one = 0, max = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 1)
                one++;
            else
                zero++;
            while (zero > 1) {
                if (nums[l] == 0)
                    zero--;
                else
                    one--;
                l++;
            }
            if (zero == 1)
                max = Math.max(max, one);
        }
        return (max == 0) && one == 0 ? 0 : max == 0 ? one - 1 : max;
    }
}