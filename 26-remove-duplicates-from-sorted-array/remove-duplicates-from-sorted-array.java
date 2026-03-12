class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1, i;
        for (i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}