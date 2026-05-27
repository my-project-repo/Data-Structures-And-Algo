class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] upper = new boolean[26];
        boolean[] lower = new boolean[26];
        boolean[] invalid = new boolean[26];
        int res = 0;
        for (int i = 0;i<word.length();i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                int idx = ch - 'A';
                upper[idx] = true;
            } else {
                int idx = ch - 'a';
                if (upper[idx])
                    invalid[idx] = true;
                lower[idx] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (upper[i] && lower[i] && !invalid[i])
                res++;
        }

        return res;
    }
}