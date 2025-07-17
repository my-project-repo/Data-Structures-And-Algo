class Solution {
    public int jump(int[] nums) {
        int max = 0, maxEnd = 0, counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxEnd) {
                counter++;
                maxEnd = max;
            }
            max = Math.max(max, i + nums[i]);
        }
        return counter;
    }
}