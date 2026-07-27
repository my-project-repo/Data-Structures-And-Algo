class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        int secondMax = (max == 0) ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            if (i == max)
                continue;
            if (nums[secondMax] < nums[i])
                secondMax = i;
        }

        return (nums[max] - 1) * (nums[secondMax] - 1);
    }
}