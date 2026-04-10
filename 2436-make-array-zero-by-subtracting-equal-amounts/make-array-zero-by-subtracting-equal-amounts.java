class Solution {
    public int minimumOperations(int[] nums) {
        int [] freq = new int[101];
        int res = 0;
        for (int i : nums)
        {
            if (i == 0) continue;
            if (freq[i] == 0) res++;
            freq[i]++;
        }
        return res;
    }
}