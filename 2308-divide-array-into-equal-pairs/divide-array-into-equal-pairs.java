class Solution {
    public boolean divideArray(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq % 2 != 0)
                return false;
            count += freq / 2;
        }
        return count == nums.length / 2;
    }
}