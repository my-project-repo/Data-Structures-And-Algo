class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        int n = s.length();
        StringBuilder initial = new StringBuilder();
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        char[] ans = new char[n];
        int j = 0;
        for (int i = 0; i < 26; i++) {
            int fr = freq[i];
            while (fr > 1) {
                ans[j] = (char) ('a' + i);
                ans[n - j - 1] = (char) ('a' + i);
                j++;
                fr -= 2;
            }

            if (fr == 1)
                ans[n / 2] = (char) ('a' + i);
        }

        return new String(ans);
    }
}