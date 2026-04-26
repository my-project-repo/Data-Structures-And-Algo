class Solution {
    public int mirrorDistance(int n) {
        int t = n , rev = 0;
        while (t > 0)
        {
            rev = rev * 10 + (t % 10);
            t /= 10;
        }

        return Math.abs(n-rev);
    }
}