class Solution {
    public int maximizeGreatness(int[] nums) {
        int idx = 0, idx2 = 0, edx = nums.length, counter = 0;
        Arrays.sort(nums);
        while (idx < edx && idx2 < edx) {
            if (nums[idx] > nums[idx2]) {
                counter++;
                idx2++;
            }
            idx++;
        }
        return counter;

    }
}