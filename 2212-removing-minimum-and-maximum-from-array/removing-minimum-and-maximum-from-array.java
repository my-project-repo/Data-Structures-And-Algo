class Solution {
    public int minimumDeletions(int[] nums) {
        int min = nums[0], max = nums[0];
        int disMin = 0, disMax = 0, n = nums.length;
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                disMin = (i + 1);
            } else if (nums[i] == max) {
                disMax = (i + 1);
            }
        }

        int minDis = disMin, maxDis = disMax;
        disMin = disMax = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == min) {
                disMin = (n - i);
            } else if (nums[i] == max) {
                disMax = (n - i);
            }
        }
        int a = Math.max(minDis, maxDis);
        int b = Math.max(disMax, disMin);
        int c = Math.min(minDis, disMin) + Math.min(maxDis, disMax);
        return Math.min(a, Math.min(b, c));
    }
}