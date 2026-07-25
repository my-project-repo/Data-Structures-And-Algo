class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currSum = nums[0], maxSum = nums[0], totalSum = nums[0];
        // kadane
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
            totalSum += nums[i];
        }

        currSum = nums[0];
        int minSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.min(nums[i], currSum + nums[i]);
            minSum = Math.min(minSum, currSum);
        }

        if (totalSum == minSum) return maxSum;
        return Math.max(maxSum, totalSum - minSum);
    }
}