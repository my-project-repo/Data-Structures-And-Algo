class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int prev = 0, n = pairs.length, res = 1;
        for (int i = 1; i < n; i++) {
            if (pairs[prev][1] < pairs[i][0]) {
                prev = i;
                res++;
            }
        }

        return res;
    }
}