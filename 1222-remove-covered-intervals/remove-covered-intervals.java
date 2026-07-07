class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];
            return a[0] - b[0];
        });

        int max = intervals[0][1], res = 1;
        for (int curr = 1; curr < intervals.length; curr++) {
            if (intervals[curr][1] > max) {
                res++;
                max = intervals[curr][1];
            }
        }

        return res;
    }
}