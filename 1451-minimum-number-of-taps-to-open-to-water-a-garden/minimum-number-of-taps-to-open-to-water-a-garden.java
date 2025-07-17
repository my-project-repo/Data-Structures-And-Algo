class Solution {
    public int minTaps(int n, int[] ranges) {
        int min, max, maxRes = 0, counter = 0;
        int[] res = new int[ranges.length];
        for (int i = 0; i < ranges.length; i++) {
            min = Math.max(0, i - ranges[i]);
            max = Math.min(n, i + ranges[i]);
            res[min] = Math.max(res[min], max);
        }
        max = 0;
        for (int i = 0; i <= n; i++) {
            if (i > max)
                return -1;
            if (i > maxRes) {
                counter++;
                maxRes = max;
            }
            max = Math.max(max, res[i]);
        }
        return counter;

    }
}