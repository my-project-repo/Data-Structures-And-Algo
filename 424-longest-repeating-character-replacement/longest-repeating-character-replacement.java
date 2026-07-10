class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0, max = 0, n = s.length(), maxFreq = 0;
        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}