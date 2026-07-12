class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0)
            return false;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1 && !next(i, nums, k))
                return false;
        }

        return true;
    }

    boolean next(int i, int[] nums, int k) {
        int d = nums[i] + 1, c = 1;
        i++;
        while (i < nums.length && c < k) {
            if (nums[i] == d) {
                d++;
                nums[i] = -1;
                c++;
            }
            i++;
        }

        return c == k;
    }
}