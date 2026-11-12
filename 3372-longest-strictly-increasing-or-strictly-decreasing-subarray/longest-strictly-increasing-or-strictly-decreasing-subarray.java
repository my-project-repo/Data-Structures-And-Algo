class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int si = 1, sc = 1, maxInc = 1, maxDec = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > nums[j - 1]) {
                si++;
                maxInc = Math.max(maxInc, si);
                sc = 1;
            } else if (nums[j] < nums[j - 1]) {
                sc++;
                maxDec = Math.max(maxDec, sc);
                si = 1;
            } else {
                si = sc = 1;
            }
        }
        return Math.max(maxInc, maxDec);
    }
}