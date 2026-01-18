class Solution {
    public int maximumCount(int[] nums) {
        int max = 0, maxSec = 0, i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;
                if (nums[i] != 0) maxSec++;
        }
        return Math.max(nums.length-i, maxSec);
    }
}