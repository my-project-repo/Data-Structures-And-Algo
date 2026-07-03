class Solution {
    public int longestOnes(int[] nums, int k) {
        int one = 0, zero = 0, l = 0, max = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 1)
                one++;
            else
                zero++;
            while (zero > k) {
                if (nums[l] == 0)
                    zero--;
                else
                    one--;
                l++;
            }

            if (zero <= k)
                max = Math.max(max, r - l + 1);
        }

        return max;
    }
}