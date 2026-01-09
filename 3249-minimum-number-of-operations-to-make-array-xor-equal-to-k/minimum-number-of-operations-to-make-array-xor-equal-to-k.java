class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0, res = 0;
        for (int i : nums) xor ^= i;
        xor ^= k;
        while (xor != 0)
        {
            if ((xor & 1 ) == 1) res++;
            xor >>= 1;
        }
        return res;
    }
}