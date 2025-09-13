class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long minus = 0, res = 0;
        int n = happiness.length;
        Arrays.sort(happiness);
        for (int i = n - 1; i >= n - k; i--) {
            res += Math.max(happiness[i] - minus, 0);
            minus++;
        }
        return res;
    }
}