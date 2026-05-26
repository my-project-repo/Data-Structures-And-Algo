class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[][] freq = new boolean[26][2];
        int res = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                freq[ch - 'A'][0] = true;
            } else
                freq[ch - 'a'][1] = true;
        }

        for (int i = 0;i<26;i++)
        {
            if (freq[i][0] && freq[i][1]) res++;
        }

        return res;
    }
}