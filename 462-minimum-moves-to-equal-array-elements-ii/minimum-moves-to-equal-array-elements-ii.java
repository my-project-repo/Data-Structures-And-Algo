class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int mid = nums[nums.length / 2];
        for (int i : nums) {
            res += Math.abs(mid - i);
        }
        return res;
    }
}