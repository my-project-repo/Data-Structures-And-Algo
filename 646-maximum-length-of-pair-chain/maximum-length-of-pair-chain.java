class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int idx = 0, idx2 = 1, n = pairs.length, res = 1;
        while (idx < idx2 && idx2 < n) {
            if (pairs[idx][1] < pairs[idx2][0]) {
                res++;
                idx = idx2;
            }
            idx2++;
        }
        return res;
    }
}