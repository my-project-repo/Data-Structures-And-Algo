class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            int val = map.get(key);
            if (val == 1)
                return -1;
            while (val % 3 != 0) {
                val -= 2;
                res++;
            }
            if (val % 3 == 0)
                res += val / 3;
        }
        return res;
    }
}