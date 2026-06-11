class Solution {
    public int minDistance(String word1, String word2) {
        int i = word1.length(), j = word2.length();
        int[][] dp = new int[i][j];
        for (int[] d : dp)
            Arrays.fill(d, -1);
        return alter(i - 1, j - 1, word1, word2, dp);
    }

    int alter(int i, int j, String s1, String s2, int[][] dp) {
        if (i < 0)
            return j + 1;
        else if (j < 0)
            return i + 1;
        else if (dp[i][j] != -1)
            return dp[i][j];
        else if (s1.charAt(i) == s2.charAt(j))
            return dp[i][j] = alter(i - 1, j - 1, s1, s2, dp);
        else {
            return dp[i][j] = 1 + Math.min(alter(i - 1, j, s1, s2, dp),
                    Math.min(alter(i, j - 1, s1, s2, dp), alter(i - 1, j - 1, s1, s2, dp)));
        }
    }
}