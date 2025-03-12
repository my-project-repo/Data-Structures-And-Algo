class Solution {
    public int maximumCount(int[] nums) {
        int max = 0, maxSec = 0, i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] >= 0)
                break;
            maxSec++;
        }
        for (; i < nums.length; i++) {
            if (nums[i] == 0)
                continue;
            max = nums.length - i;
            break;
        }
        return Math.max(max, maxSec);
    }
}