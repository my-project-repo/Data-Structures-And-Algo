class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int nonlap = 1, n = intervals.length, prev = 0 , res = 1;
        for (int j = 1; j < n; j++) {
            if (intervals[j][0] >= intervals[prev][1]) {
                res++;
                prev = j;
            }
        }

        return n - res;
    }
}