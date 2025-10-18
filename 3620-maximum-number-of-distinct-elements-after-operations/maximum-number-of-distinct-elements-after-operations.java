class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0 , prev = Integer.MIN_VALUE;
        for (int val : nums)
        {
            int large = Math.max(val - k , prev + 1);
            if (large <= val + k)
            {
                prev = large;
                ans++;
            }
        }
        return ans;

    }
}