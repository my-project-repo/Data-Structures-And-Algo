class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> freq = new HashMap<>();
        int ans = 0;
        for (int i : answers) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (int i : freq.keySet()) {
            int size = i + 1;
            int groups = (int) Math.ceil(freq.get(i) * 1.0 / size);
            ans += groups * size;
        }
        return ans;
    }
}