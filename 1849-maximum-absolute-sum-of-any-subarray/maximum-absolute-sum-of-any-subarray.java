class Solution {
    public int maxAbsoluteSum(int[] nums) {
        if (nums.length==1)
        return Math.abs(nums[0]);
        // Kadane's Approach
        int max = 0, sum = 0, min = 0, sumTwo = 0;
        for (int i : nums) {
            sum += i;
            sumTwo += i;
            if (sum <= 0)
                sum = 0;
            if (sumTwo >= 0)
                sumTwo = 0;
            max = Math.max(max, sum);
            min = Math.min(sumTwo, min);
        }
        return Math.max(max, Math.abs(min));
    }
}