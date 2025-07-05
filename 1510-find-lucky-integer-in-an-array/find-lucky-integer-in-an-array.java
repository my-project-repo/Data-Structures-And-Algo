class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
        int[] freq = new int[501];
        for (int i : arr) {
            freq[i]++;
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == i)
                res = Math.max(res, i);
        }
        return res;
    }
}