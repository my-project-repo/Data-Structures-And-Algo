class Solution {
    public int maximumCount(int[] nums) {
        int max = 0, maxSec = 0;
        for (int i : nums) {
            if (i < 0)
                max++;
            else if (i > 0)
                maxSec++;
        }
        return Math.max(max,maxSec);
    }
}