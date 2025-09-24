class Solution {
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        final int mod = 1000000007;
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] - rev(nums[i]);
        }
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int val : map.values()) {
            if (val > 1)
                res = (res % mod + fact(val - 1)) % mod;
        }
        return (int)res;
    }

    int rev(int n) {
        int ans = 0;
        while (n != 0) {
            ans = ans * 10 + (n % 10);
            n /= 10;
        }
        return ans;
    }
    public long fact(int n) {
        if (n == 1)
            return 1;
        return n + fact(n - 1);
    }
}