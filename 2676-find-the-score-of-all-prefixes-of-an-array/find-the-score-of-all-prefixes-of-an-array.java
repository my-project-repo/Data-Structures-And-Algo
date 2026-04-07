class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] res = new long[nums.length];
        long max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            res[i] = max + nums[i];
        }
        for (int i = 1; i < nums.length; i++)
            res[i] = res[i] + res[i - 1];
        return res;
    }
}