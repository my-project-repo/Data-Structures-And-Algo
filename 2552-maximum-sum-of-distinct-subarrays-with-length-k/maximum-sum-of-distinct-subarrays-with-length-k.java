class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0, max = Long.MIN_VALUE;
        int l = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            if (r - l + 1 == k) {
                if (map.size() == k)
                    max = Math.max(max, sum);

                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0)
                    map.remove(nums[l]);

                sum -= nums[l];
                l++;
            }
        }

        return Math.max(max, 0);
    }
}