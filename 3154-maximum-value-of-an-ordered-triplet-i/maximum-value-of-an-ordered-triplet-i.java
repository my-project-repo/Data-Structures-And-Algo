class Solution {
    public long maximumTripletValue(int[] nums) {
        // brute force
        long res = -99, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = (long) (nums[i] - nums[j]) * nums[k];
                    res = Math.max(sum, res);
                }
            }
        }
        return Math.max(res, 0);
    }
}