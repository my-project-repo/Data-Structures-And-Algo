class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int ans = 0;
        for (int i : nums) { // O(N)
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { // O(N)
            int v = nums[i];
            if (freq.get(v) >= 3) {
                if (map.containsKey(v)) {
                    List<Integer> list = map.get(v);
                    list.add(i);
                    map.put(v, list);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(v, list);
                }
            }
        }

        for (int key : map.keySet()) {

            List<Integer> list = map.get(key);

            int gap = list.get(1) - list.get(0);

            boolean special = true;

            for (int i = 2; i < list.size(); i++) {
                if (list.get(i) - list.get(i - 1) != gap) {
                    special = false;
                    break;
                }
            }

            if (special) {
                ans++;
            }
        }

        return ans;
    }
}