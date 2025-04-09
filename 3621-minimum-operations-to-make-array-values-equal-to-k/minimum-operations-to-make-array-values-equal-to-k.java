class Solution {
    public int minOperations(int[] nums, int k) {
        int[] freq = new int[101];
        int res = 0;
        for (int i : nums) {
            if (i < k)
                return -1;
            if (freq[i] >= 1 || i == k)
                continue;
            freq[i]++;
            res++;
        }
        return res;
    }
}