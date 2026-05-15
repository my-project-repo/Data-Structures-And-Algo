class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freq = new int[101];
        int c = 0, d = 0;
        for (int i : nums)
            freq[i]++;
        for (int i = 1; i < 101; i++) {
            if (freq[i] == 0)
                continue;
            else if (freq[i] == 1)
                c++;
            else if (freq[i] > 2)
                return false;
            else
                d++;
        }
        return c % 2 == 0;
    }
}