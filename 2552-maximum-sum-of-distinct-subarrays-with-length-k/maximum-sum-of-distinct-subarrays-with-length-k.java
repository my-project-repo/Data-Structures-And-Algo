class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0, max = Long.MIN_VALUE;
        int l = 0, size = 0;
        int[] freq = new int[100001];
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            freq[nums[r]]++;
            if (freq[nums[r]] == 1)
                size++;
            if (r - l + 1 == k) {
                if (size == k)
                    max = Math.max(max, sum);
                freq[nums[l]]--;
                if (freq[nums[l]] == 0)
                    size--;
                sum -= nums[l];
                l++;
            }
        }

        return Math.max(max, 0);
    }
}