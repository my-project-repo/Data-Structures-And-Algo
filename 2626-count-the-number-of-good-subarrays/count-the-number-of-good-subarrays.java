class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long res = 0, pair = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            pair += map.getOrDefault(nums[j], 0);
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (pair >= k) {
                res += nums.length - j;
                map.put(nums[i], map.get(nums[i]) - 1);
                pair -= map.get(nums[i]);
                i++;
            }
        }
        return res;
    }
}