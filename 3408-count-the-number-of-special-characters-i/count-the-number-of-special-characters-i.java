class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] upper = new boolean[26];
        boolean[] lower = new boolean[26];
        int res = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper[ch - 'A'] = true;
            } else
                lower[ch - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (upper[i] && lower[i])
                res++;
        }

        return res;
    }
}