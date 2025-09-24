class Solution {
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        final int mod = 1000000007;
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] - rev(nums[i]);
        }
        for (int i : nums) {
            if (map.containsKey(i)) {
                res = (res % mod + map.get(i)) % mod;
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return (int) res;
    }

    int rev(int n) {
        int ans = 0;
        while (n != 0) {
            ans = ans * 10 + (n % 10);
            n /= 10;
        }
        return ans;
    }
}