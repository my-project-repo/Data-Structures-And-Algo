class Solution {
    public long maximizeSum(int[] nums, int k) {
        long ans = 0;
        Integer[][] arr = new Integer[nums.length][3];

        for (int i = 0; i < nums.length; i++) {
            int max = maxOutput(nums[i]);

            arr[i][0] = nums[i];
            arr[i][1] = max;
            arr[i][2] = max - nums[i];

            ans += nums[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[2], a[2]));

        for (int i = 0; i < nums.length && k > 0; i++) {
            if (arr[i][2] <= 0)
                break;

            ans += arr[i][2];
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