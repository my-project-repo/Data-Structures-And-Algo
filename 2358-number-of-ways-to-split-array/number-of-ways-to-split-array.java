class Solution {
    public int waysToSplitArray(int[] nums) {
        // Using Prefix Sum
        int n = nums.length, counter = 0;
        long sum = 0, sumOut = 0;
        for (int i = 0; i < n; i++) {
            sumOut += nums[i];
        }
        for (int i = 0; i < n - 1; i++) {
            sum += nums[i];
            sumOut -= nums[i];
            if (sum >= sumOut)
                counter++;
        }
        return counter;
    }
}