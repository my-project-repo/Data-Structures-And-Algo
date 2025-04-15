class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long max = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
            sum += nums.get(i);
        }
        if (map.size() >= m)
            max = Math.max(max, sum);
        for (int i = k; i < nums.size(); i++) {
            int newNum = nums.get(i);
            int oldNum = nums.get(i - k);
            sum -= oldNum;
            map.put(oldNum, map.get(oldNum) - 1);
            if (map.get(oldNum) == 0)
                map.remove(oldNum);
            sum += newNum;
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
            if (map.size() >= m) {
                max = Math.max(max, sum);
            }
        }
        return Math.max(max, 0);
    }
}