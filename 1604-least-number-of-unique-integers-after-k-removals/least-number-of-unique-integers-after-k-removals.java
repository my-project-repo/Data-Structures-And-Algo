class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.size());
        list.addAll(map.values());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);
            if (count > k)
                return list.size() - i;
        }
        return 0;
    }
}