class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = nums[i] * nums[i];
        Arrays.sort(arr);
        int mid = n / 2;
        long sum = 0;
        for (long i : arr) {
            sum += i;
        }

        for (int i = 0; i < mid; i++)
            sum -= 2 * arr[i];

        return sum;

    }
}