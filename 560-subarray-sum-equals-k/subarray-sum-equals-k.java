class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0, total = 0;
        for (int i : nums) {
            prefixSum += i;
            int find = prefixSum - k;
            if (map.containsKey(find))
                total += map.get(find);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return total;
    }
}