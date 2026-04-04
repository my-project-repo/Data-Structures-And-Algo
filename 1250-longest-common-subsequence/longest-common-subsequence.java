class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] dp = new int[text1.length()][text2.length()];
        for (int [] a : dp) Arrays.fill(a,-1);
        return fun(0,0,text1.toCharArray(),text2.toCharArray(), dp);
    }
    int fun (int i , int j , char [] first , char [] second , int [][] dp)
    {
        if (i >= first.length || j >= second.length) return 0;
        else if (dp[i][j] != -1) return dp[i][j];
        else if (first[i] == second[j])
        {
            return 1 + fun(i+1,j+1,first,second,dp);
        } else
        return dp[i][j] = Math.max(fun(i+1,j,first,second,dp),fun(i,j+1,first,second,dp));
    }
}