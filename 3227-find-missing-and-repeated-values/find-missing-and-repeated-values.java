class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        int[] freq = new int[(grid.length * grid.length) + 1];
        for (int[] a : grid) {
            for (int i : a) {
                freq[i]++;
            }
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2)
                res[0] = i;
            else if (freq[i] == 0)
                res[1] = i;
        }
        return res;

    }
}