class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return window(nums,k) - window(nums,k-1);
    }

    int window(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, l = 0;
        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.size() > k) {
                int var = nums[l];
                map.put(var, map.get(var) - 1);
                if (map.get(var) == 0)
                    map.remove(var);
                l++;

            }
                sum += r - l + 1;
        }
        return sum;
    }
}