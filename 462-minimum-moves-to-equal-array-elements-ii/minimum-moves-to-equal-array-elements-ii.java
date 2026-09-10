class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length , ans = 0;
        int mid = n / 2;
        for (int i = 0; i < mid; i++) {
            ans += nums[mid] - nums[i];
        }
        for (int i = mid+1;i<n;i++)
        {
            ans += nums[i] - nums[mid];
        }

        return ans;
    }
}