class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        StringBuilder initial = new StringBuilder();
        char middle = ' ';
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1)
                middle = (char) ('a' + i);
            for (int j = 0; j < freq[i] / 2; j++) {
                initial.append((char) ('a' + i));
            }
        }

        StringBuilder finalString = new StringBuilder();
        finalString.append(initial);
        if (middle != ' ')
            finalString.append(middle);
        finalString.append(initial.reverse());
        return finalString.toString();
    }
}