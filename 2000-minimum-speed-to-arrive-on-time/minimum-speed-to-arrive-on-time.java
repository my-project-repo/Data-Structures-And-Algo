class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int min = 1, max = (int) 1e7, res = -1, mid;
        while (min <= max) {
            mid = min + (max - min) / 2;
            if (solve(mid, dist, hour)) {
                res = mid;
                max = mid - 1;
            } else
                min = mid + 1;
        }
        return res;
    }

    private boolean solve(int mid, int[] dist, double hour) {
        double ans = 0;
        for (int i = 0; i < dist.length; i++) {
            double d = dist[i] * 1.0 / mid;
            if (i != dist.length - 1)
                ans += Math.ceil(d);
            else
                ans += d;
            if (ans > hour)
                return false;
        }
        return ans <= hour;
    }

}