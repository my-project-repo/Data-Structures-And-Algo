class Solution {
    public long gcdSum(int[] nums) {
        int max = 0 , n = nums.length;
        long res = 0;
        int [] prefixGcd = new int[n];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGcd);
        int idx = 0 , edx = n-1;
        while (idx < edx)
        {
            res += gcd(prefixGcd[idx],prefixGcd[edx]);
            idx++; edx--;
        }
        return res;
    }

    int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
}