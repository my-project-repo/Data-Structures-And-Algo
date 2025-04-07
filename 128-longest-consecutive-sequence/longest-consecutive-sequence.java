class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int p = nums[0], max = Integer.MIN_VALUE, counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            if (nums[i] != p + 1) {
                max = Math.max(max, counter);
                counter = 1;
                p = nums[i];
            } else {
                counter++;
                p++;
            }
        }
        return Math.max(max, counter);
    }
}