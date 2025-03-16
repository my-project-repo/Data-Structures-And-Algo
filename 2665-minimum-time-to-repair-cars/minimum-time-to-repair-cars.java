class Solution {
    public long repairCars(int[] ranks, int cars) {
        long max = Integer.MIN_VALUE, left, right, mid;
        long ans = 0;
        for (int i : ranks) {
            max = Math.max(max, i);
        }
        left = 1;
        right = max * cars * cars;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (IsAchievable(mid, ranks, cars)) {
                ans = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return ans;
    }

    private boolean IsAchievable(long time, int[] ranks, int cars) {
        long car = 0;
        for (int i : ranks) {
            car += Math.sqrt((time * 1.0) / i);
        }
        return car >= (long) cars;
    }

}