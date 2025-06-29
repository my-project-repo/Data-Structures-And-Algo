class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        final int MOD = 1_000_000_007, n = nums.length;
        int[] power = new int[n];
        int idx = 0, edx = n - 1, res = 0;
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }
        while (idx <= edx) {
            if (nums[idx] + nums[edx] <= target) {
                res = (res + power[edx - idx]) % MOD;
                idx++;
            } else
                edx--;
        }
        return res;

    }
}