class Solution {
    public int[] avoidFlood(int[] rains) {
        TreeSet<Integer> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[rains.length];
        for (int i = 0; i < rains.length; i++) {
            int lake = rains[i];
            if (lake == 0)
                set.add(i);
            else {
                if (map.containsKey(lake)) {
                    Integer index = set.ceiling(map.get(lake));
                    if (index == null)
                        return new int[] {};
                    ans[index] = lake;
                    set.remove(index);
                }

                map.put(lake, i);
                ans[i] = -1;
            }
        }

        for (int i : set) ans[i] = 1;

        return ans;
    }
}