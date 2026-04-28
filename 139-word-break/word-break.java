class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        int n = s.length();
        Boolean[][] dp = new Boolean[n + 1][n + 1];
        for (String st : wordDict)
            set.add(st);
        return pp(0, n, s, set,dp);
    }

    boolean pp(int s, int e, String str, Set<String> set, Boolean [][] dp) {
        if (s >= e)
            return true;
            else if (dp[s][e] != null) return dp[s][e];

        for (int k = s; k < e; k++) {
            String sub = str.substring(s, k + 1);
            if (set.contains(sub) && pp(k + 1, e, str, set,dp))
                return dp[s][e] = true;
        }
        return dp[s][e] = false;
    }

}