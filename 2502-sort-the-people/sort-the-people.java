class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] res = new String[names.length];
        int p = 0;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = heights.length - 1; i >= 0; i--) {
            res[p++] = map.get(heights[i]);
        }
        return res;
    }
}