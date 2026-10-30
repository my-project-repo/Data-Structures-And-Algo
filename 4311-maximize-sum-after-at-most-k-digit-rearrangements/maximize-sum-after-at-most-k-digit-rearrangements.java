class Solution {
    public long maximizeSum(int[] nums, int k) {
        long ans = 0;
        int n = nums.length;
        long[] gain = new long[n];
        for (int i = 0; i < n; i++) {
            ans += nums[i];
            int max = maxOutput(nums[i]);
            gain[i] = max - nums[i];
        }

        Arrays.sort(gain);
        for (int i = n - 1; i >= 0 && k > 0; i--) {
            ans += gain[i];
            k--;
        }

        return ans;
    }

    int maxOutput(int n) {
        int[] freq = new int[10];
        int size = -1;
        int ans = 0;

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
            size++;
        }

        for (int i = 9; i >= 0; i--) {
            while (freq[i] > 0) {
                ans += (int) Math.pow(10, size) * i;
                size--;
                freq[i]--;
            }
        }

        return ans;
    }
}