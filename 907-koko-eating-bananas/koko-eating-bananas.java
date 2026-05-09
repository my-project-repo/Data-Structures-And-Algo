class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int idx = 0, edx = 0, ans = 0;
        for (int i : piles)
            edx = Math.max(edx, i);

        while (idx <= edx) {
            int mid = idx + (edx - idx) / 2;
            if (isPossible(piles, mid, h)) {
                ans = mid;
                edx = mid - 1;
            } else
                idx = mid + 1;
        }

        return ans;
    }

    boolean isPossible(int[] piles, int k, int h) {
        if (k <= 0)
            return false;
        long hours = 0;
        for (int i : piles) {
            hours += (int) Math.ceil(i * 1.0 / k);
        }

        return hours <= h;

    }
}