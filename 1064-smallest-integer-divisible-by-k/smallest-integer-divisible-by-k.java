class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k == 2 || k == 5)return -1;
        int res = 1, x = 1;
        if (x % k == 0)return res;
        for (int i = 0; i < k; i++) {
            res++;
            x = (x * 10 + 1) % k;
            if (x == 0)
                return res;
        }
        return -1;
    }
}