class Solution {
    public int minCut(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return pp(0, ch, dp) - 1;
    }

    int pp(int i, char[] ch, int[] dp) {
        if (i >= ch.length)
            return 0;
        if (dp[i] != -1)
            return dp[i];
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < ch.length; k++) {
            if (isPal(i, k, ch)) {
                ans = Math.min(ans, 1 + pp(k + 1, ch, dp));
            }
        }
        return dp[i] = ans;
    }

    boolean isPal(int idx, int edx, char[] s) {
        while (idx < edx) {
            if (s[idx] != s[edx])
                return false;
            idx++;
            edx--;
        }
        return true;
    }
}