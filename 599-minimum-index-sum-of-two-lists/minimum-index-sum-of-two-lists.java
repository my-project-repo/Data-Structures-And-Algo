class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int j = map.get(list2[i]);
                if (j + i > min)
                    continue;
                if (j + i < min) {
                    min = j + i;
                    list = new ArrayList<>();
                }
                list.add(list2[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}