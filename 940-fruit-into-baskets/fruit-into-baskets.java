class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0, left = 0;
        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while (map.size() > 2) {
                int val = map.get(fruits[left]);
                if (val == 1)
                    map.remove(fruits[left]);
                else
                    map.put(fruits[left], val - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}