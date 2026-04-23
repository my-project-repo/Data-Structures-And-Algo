class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int total = 0, leftSum = 0, rightSum = 0;
        for (int i : nums)
            total += i;
        for (int i = 0; i < n; i++) {
            rightSum = total - leftSum - nums[i];
            int r = nums[i] * i - leftSum + rightSum - (n - i - 1) * nums[i];
            res[i] = r;
            leftSum += nums[i];
        }
        return res;
    }
}