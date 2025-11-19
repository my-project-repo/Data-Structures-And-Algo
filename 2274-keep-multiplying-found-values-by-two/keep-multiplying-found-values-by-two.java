class Solution {
    public int findFinalValue(int[] nums, int original) {
        int[] freq = new int[1001];
        for (int i : nums)
            freq[i]++;
        while (original < 1001 && freq[original] >= 1) {
            original *= 2;
        }
        return original;
    }
}