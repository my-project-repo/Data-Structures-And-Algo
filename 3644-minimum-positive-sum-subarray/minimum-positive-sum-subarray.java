class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            int sum = 0, p = 0;
            for (int j = 0; j < i; j++) {
                sum += nums.get(j);
            }
            if (sum > 0)
                ans = Math.min(ans, sum);
            for (int j = i; j < nums.size(); j++) {
                sum += nums.get(j);
                sum -= nums.get(p++);
                if (sum > 0)
                    ans = Math.min(ans, sum);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}