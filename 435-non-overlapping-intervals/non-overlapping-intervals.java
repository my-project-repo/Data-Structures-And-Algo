class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] == b[1])
                return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        int nonlap = 1, n = intervals.length, prev = 0, res = 1;
        for (int j = 1; j < n; j++) {
            if (intervals[prev][1] <= intervals[j][0]) {
                res++;
                prev = j;
            }
        }

        return n - res;
    }
}