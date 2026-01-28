class Solution {
    int min = Integer.MAX_VALUE;
    public int numSquares(int n) {
        return rec(n,new int[n+1]);
    }
    int rec (int n, int [] arr)
    {
        if (n == 0) return 0;
        if (arr[n] != 0) return arr[n];
        for (int i = 1; i * i <= n;i++)
        {
            min = Math.min(min,1+rec(n-(i*i),arr));
            arr[n] = min;
        }
        return arr[n];
    }
}