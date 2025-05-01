class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : time) {
            int mod = num % 60;
            if (mod == 0) {
                count += map.getOrDefault(0, 0);
            }
            if (map.containsKey(60 - mod)) {
                count += map.get(60 - mod);
            }
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        return count;

    }
}