class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // Kadane's Approach
        int max = 0, sum = 0, min = 0, sumTwo = 0;
        for (int i : nums) {
            sum += i;
            if (sum <= 0)
                sum = 0;
            max = Math.max(max, sum);
        }
        for (int i : nums) {
            sumTwo += i;
            if (sumTwo >= 0)
                sumTwo = 0;
            min = Math.min(sumTwo, min);
        }
        return Math.max(max, Math.abs(min));
    }
}