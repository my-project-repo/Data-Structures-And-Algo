class Solution {
    public boolean check(int[] nums) {
        int c = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > nums[(i + 1) % len])
                c++;
        }
        return c == 1 || c == 0;

    }
}