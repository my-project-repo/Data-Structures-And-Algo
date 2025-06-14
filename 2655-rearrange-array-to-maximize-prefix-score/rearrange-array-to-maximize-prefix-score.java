class Solution {
    public int maxScore(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if (nums[n - 1] <= 0)
            return 0;
        if (nums[0] > 0)
            return n;
        int counter = 0;
        long calc = 0;
        for (int i = n - 1; i >= 0; i--) {
            calc += nums[i];
            if (calc <= 0)
                break;
            counter++;
        }
        return counter;
    }
}