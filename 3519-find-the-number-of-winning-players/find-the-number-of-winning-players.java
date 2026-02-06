class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] freq = new int[n][11];
        int res = 0;
        for (int[] p : pick) {
            int i = p[0];
            int j = p[1];
            freq[i][j]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 11; j++) {
                if (freq[i][j] > i) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}