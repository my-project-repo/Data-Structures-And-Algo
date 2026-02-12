class Solution {
    public int longestBalanced(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;
                if (isBalanced(freq))
                    max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
    boolean isBalanced (int [] freq)
    {
        int prev = 0;
        for (int i = 0;i<26;i++)
        {
            if (freq[i] == 0) continue;
            if (prev != 0)
            {
                if (prev != freq[i]) return false;
            }
            prev = freq[i];
        }
        return true;
    }
}