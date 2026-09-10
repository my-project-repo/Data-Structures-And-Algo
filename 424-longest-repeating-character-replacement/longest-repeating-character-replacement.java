class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0, ans = 0, max = 0;
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            freq[ch - 'A']++;
            max = Math.max(max, freq[ch - 'A']);
            while ((r - l + 1) - max > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}