class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, count = 0;
        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                count++;
                nums[i] = 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
            }
        }
        return (nums[n - 2] == 1 && nums[n - 1] == 1) ? count : -1;

    }
}