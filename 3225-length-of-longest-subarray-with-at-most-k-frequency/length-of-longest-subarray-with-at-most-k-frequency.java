class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, max = Integer.MIN_VALUE;
        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.get(nums[right]) > k) {
                int val = map.get(nums[left]) - 1;
                if (val == 0)
                    map.remove(nums[left]);
                else
                    map.put(nums[left], val);
                left++;
            }
            if (map.get(nums[right]) <= k)
                max = Math.max(max, (right - left) + 1);
        }
        return max;
    }
}