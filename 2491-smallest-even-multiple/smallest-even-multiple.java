class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return gcm (2 , n , n);
        return 2 * n;
    }
    int gcm (int x , int y , int temp)
    {
        if (y == 0) return 2 * temp / x;
        return gcm (y , x % y, temp);
    }
}