class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        int n = s.length();
        Boolean[] dp = new Boolean[n + 1];
        for (String st : wordDict)
            set.add(st);
        return pp(0, s, set,dp);
    }

    boolean pp(int s, String str, Set<String> set, Boolean [] dp) {
        if (s >= str.length())
            return true;
            else if (dp[s] != null) return dp[s];

        for (int k = s; k < str.length(); k++) {
            String sub = str.substring(s, k + 1);
            if (set.contains(sub) && pp(k + 1,str, set,dp))
                return dp[s] = true;
        }
        return dp[s] = false;
    }

}