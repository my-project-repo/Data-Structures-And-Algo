class Solution {
    public int smallestValue(int n) {

        while (true)
        {
            int x = sum(n);
            if (x == n) break;
            n = x;
        }
        return n;

        
    }
    int sum (int n)
    {
        int sum = 0;
        for (int i = 2;i<=n;i++)
        {
            while (n % i == 0)
            {
                sum += i;
                n /= i;
            }
        }
        return sum;
    }
}