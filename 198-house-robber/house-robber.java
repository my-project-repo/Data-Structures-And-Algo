class Solution {
    public int rob(int[] nums) {
        int prev = nums[0];
        int prev2 = 0;

        for (int i = 2; i <= nums.length; i++) {
            int take = nums[i - 1] + prev2;
            int not = prev;

            int curr = Math.max(take, not);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}