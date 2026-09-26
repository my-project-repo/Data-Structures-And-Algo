class Solution {
    public int maxValidSplits(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;

        int max = fn(nums);
        for (int i = 0; i < n; i++) {
            int[] arr = new int[n - 1];
            for (int j = 0, p = 0; j < n; j++) {
                if (i == j) continue;
                arr[p++] = nums[j];
            }
            max = Math.max(max,fn(arr));
        }

        return max;
    }

    int fn(int[] nums) {
        int n = nums.length, ans = 0;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            prefix[i] = gcd(nums[i], prefix[i - 1]);
            suffix[n - i - 1] = gcd(nums[n - i - 1], suffix[n - i]);
        }

        for (int i = 0; i < n - 1; i++) {
            if (prefix[i] == suffix[i + 1])
                ans++;
        }

        return ans;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}