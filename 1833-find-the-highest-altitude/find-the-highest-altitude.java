class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0 , prefix = 0;
        for (int i : gain)
        {
            prefix += i;
            ans = Math.max(prefix,ans);
        }
        System.gc();
        return ans;
    }
}