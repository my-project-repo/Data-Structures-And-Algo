class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
        int[] freq = new int[501];
        for (int i : arr) {
            freq[i]++;
        }
        for (int i : arr) {
            if (freq[i] == i)
                res = Math.max(res, i);
        }
        return res;
    }
}