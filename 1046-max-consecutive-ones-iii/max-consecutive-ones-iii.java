class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero = 0, one = 0, l = 0, ans = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 1)
                one++;
            else
                zero++;
            while (l <= r && zero > k) {
                if (nums[l] == 1)
                    one--;
                else
                    zero--;
                l++;
            }
            
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}