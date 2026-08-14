class Solution {
    public int rob(int[] nums) {
         if (nums.length == 1) return nums[0];
        int n = nums.length - 1, p = 0, k = 0;
        int[] first = new int[n];
        int[] second = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (i != 0)
                first[p++] = nums[i];
            if (i != n)
                second[k++] = nums[i];
        }

        return Math.max(max(first), max(second));
    }

    int max(int[] nums) {
        int prev = nums[0];
        int prev2 = 0;

        for (int i = 2; i <= nums.length; i++) {
            int take = nums[i - 1] + prev2;
            int not = prev;

            int curr = Math.max(take, not);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}