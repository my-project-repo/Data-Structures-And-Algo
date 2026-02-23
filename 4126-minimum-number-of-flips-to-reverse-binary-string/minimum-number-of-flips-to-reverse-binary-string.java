class Solution {
    public int minimumFlips(int n) {
        int r = 0, temp = n, l = 0, res = 0;
        while (temp > 0)
        {
            r++;
            temp >>= 1;
        }
        r--;
        while (l < r)
        {
            res += ((n >> r) & 1) ^ ((n >> l) & 1);
            l++;
            r--;
        }
        return 2 * res;

    }
}