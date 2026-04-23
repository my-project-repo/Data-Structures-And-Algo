class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int [] res = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        for (int i = 0 ;i<n;i++)
        {
            int left_elements = i;
            int right_elements = n-i-1;
            int left = prefix[i] - nums[i];
            int right = prefix[n-1] - prefix[i];
            int total = ((nums[i] * left_elements) - left) + (right - (nums[i] * right_elements));
            res[i] = total;
        }
        return res;
    }
}