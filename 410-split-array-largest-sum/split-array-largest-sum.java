class Solution {
    public int splitArray(int[] nums, int k) {
        int idx = 0, edx = 0, ans = 0;
        for (int i : nums) {
            idx = Math.max(idx, i);
            edx += i;
        }
        while (idx <= edx) {
            int mid = (edx + idx) / 2;
            if (isPossible(nums, k, mid)) {
                ans = mid;
                edx = mid - 1;
            } else
                idx = mid + 1;
        }

        return ans;
    }

    boolean isPossible(int[] nums, int k, int cost) {
        int sum = 0, p = 1;
        for (int i : nums) {
            if (sum + i > cost) {
                p++;
                sum = 0;
            }

            sum += i;
        }

        return p <= k;
    }
}