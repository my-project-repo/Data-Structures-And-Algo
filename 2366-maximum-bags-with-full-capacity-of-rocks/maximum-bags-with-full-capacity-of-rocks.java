class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] req = new int[rocks.length];
        int res = 0;
        for (int i = 0; i < capacity.length; i++) {
            req[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(req);
        for (int i : req) {
            if (i <= additionalRocks) {
                res++;
                additionalRocks -= i;
            } else
                break;
        }
        return res;

    }
}