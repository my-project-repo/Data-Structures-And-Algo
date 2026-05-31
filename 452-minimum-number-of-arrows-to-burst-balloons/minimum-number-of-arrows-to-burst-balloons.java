class Solution {
    public int findMinArrowShots(int[][] P) {
        Arrays.sort(P, (a, b) -> Integer.compare(a[1], b[1]));
        int res = 1, prev = 0;
        for (int i = 1; i < P.length; i++) {
            if (P[prev][1] < P[i][0]) {
                res++;
                prev = i;
            }
        }

        return res;
    }
}