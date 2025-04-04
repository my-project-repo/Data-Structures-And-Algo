class Solution {
    public int maximizeGreatness(int[] nums) {
        int counter = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[counter])
                counter++;
        }
        return counter;
    }
}