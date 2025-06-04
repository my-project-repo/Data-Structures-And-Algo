class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] res = new String[names.length];
        int p = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < heights.length; i++)
            map.put(heights[i], i);
        Arrays.sort(heights);
        for (int i = heights.length - 1; i >= 0; i--) {
            int elem = heights[i];
            res[p++] = names[map.get(elem)];
        }
        return res;
    }
}