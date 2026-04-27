class Solution {
    public int minCut(String s) {
        int n = s.length();
        int [][] dp = new int[n+1][n+1];
        for (int [] arr : dp) Arrays.fill(arr,-1);
        return pp(0,n-1,s,dp);
    }
    int pp (int s , int e , String st , int [][]dp)
    {
        if (s >= e) return 0;
        else if (isPal(s,e,st)) return 0;
        else if (dp[s][e] != -1) return dp[s][e];
        int min = Integer.MAX_VALUE;
        for (int k = s;k<e;k++)
        {
            if (isPal(s,k,st))
            {
                int count = 1 + pp(k+1,e,st,dp);
                min = Math.min(min,count);
            }
        }
        return dp[s][e] = min;
    }
    boolean isPal (int idx , int edx , String s)
    {
        while (idx < edx)
        {
            if (s.charAt(idx) != s.charAt(edx)) return false;
            idx++; edx--;
        }
        return true;
    }
}