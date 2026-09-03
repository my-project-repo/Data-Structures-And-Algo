class Solution {
    public boolean uniformArray(int[] nums) {
        int min = nums[0];
        for (int i : nums)
            min = Math.min(min, i);
        if (min % 2 == 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == min || nums[i] % 2 == 0)
                    continue;
                return false;
            }

            return true;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 != 0)
                    continue;
                else {
                    if (min > nums[i])
                        return false;
                }
            }
            return true;
        }

    }
}