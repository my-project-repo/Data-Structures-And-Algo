class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long res = 0, pair = 0;
        int i = 0, j = 0;
        while (j < nums.length) {
            pair += map.getOrDefault(nums[j], 0);
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (pair >= k) {
                res += nums.length - j;
                map.put(nums[i], map.get(nums[i]) - 1);
                pair -= map.get(nums[i]);
                i++;
            }
            j++;
        }
        return res;
    }
}