class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] difference = new int[nums.length];
        int prefix = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            difference[i] = nums[i + 1] + difference[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            difference[i] = Math.abs(difference[i] - prefix);
            prefix += nums[i];
        }
        return difference;
    }
}