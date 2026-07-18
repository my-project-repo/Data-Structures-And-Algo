class Solution {
    public boolean stoneGame(int[] nums) {
        int i = 0, j = nums.length - 1, a = 0, b = 0;
        boolean flag = true;
        while (i <= j) {
            if (flag) {
                if (nums[i] > nums[j]) {
                    a += nums[i];
                    i++;
                } else {
                    a += nums[j];
                    j--;
                }
            } else {
                if (nums[i] > nums[j]) {
                    b += nums[j];
                    j--;
                } else {
                    b += nums[i];
                    i++;
                }
            }

            flag = !flag;
        }

        return a >= b;
    }
}