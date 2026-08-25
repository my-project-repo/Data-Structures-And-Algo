class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int idx = 0, edx = 1000000000, ans = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        while (idx <= edx) {
            int radius = (edx + idx) / 2;
            if (isPossible(radius, houses, heaters)) {
                ans = radius;
                edx = radius - 1;
            } else
                idx = radius + 1;
        }

        return ans;
    }

    boolean isPossible(int radius, int[] houses, int[] heaters) {
        int idx = 0, idx2 = 0, edx = houses.length, edx2 = heaters.length;
        while (idx < edx && idx2 < edx2) {
            if ((heaters[idx2] + radius) >= houses[idx] && houses[idx] >= (heaters[idx2] - radius))
                idx++;
            else
                idx2++;
        }

        if (idx == edx)
            return true;
        return false;
    }
}