class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
       int [] freq = new int[10001];
        int sum = 0 , count = 0;
        for (int i : banned)
        {
            freq[i]++;
        }
        for (int i = 1;i<=n;i++)
        {
            if (freq[i]!=0) continue;
            sum += i;
            if (sum > maxSum) return count;
            count++;
        }
        return count;
    }
}