class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int idx = 0, edx = 1000000000, ans = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        while (idx <= edx) {
            int r = (edx + idx) / 2;
            if (isPossible(r, houses, heaters)) {
                ans = r;
                edx = r - 1;
            } else
                idx = r + 1;
        }

        return ans;
    }

    boolean isPossible(int radius, int[] house, int[] H) {
        int idx = 0, i = 0;
        while (i < house.length && idx < H.length) {
            if (H[idx] >= house[i] && (H[idx] - radius) <= house[i])
                i++;

            else if (H[idx] < house[i] && (H[idx] + radius) >= house[i])
                i++;
            else {
                idx++;
            }
        }

        return i == house.length;
    }
}