class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        for (int[] a : grid) {
            for (int i : a) {
                if (set.contains(i))
                    res[0] = i;
                set.add(i);
            }
        }
        for (int i = 0; i < grid.length * grid.length; i++) {
            if (!set.contains(i + 1)) {
                res[1] = i + 1;
                break;
            }
        }
        return res;

    }
}