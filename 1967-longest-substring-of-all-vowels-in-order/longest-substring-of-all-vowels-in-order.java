class Solution {
    public int longestBeautifulSubstring(String word) {
        int max = 0, counter = 1, n = word.length(), vowel = 1;
        for (int i = 1; i < n; i++) {
            if (word.charAt(i) == word.charAt(i-1)) {
                vowel++;
            } else if (word.charAt(i - 1) < word.charAt(i)) {
                counter++;
                vowel++;
            } else {
                counter = 1;
                vowel = 1;
            }
            if (counter == 5) {
                max = Math.max(max, vowel);
            }
        }
        return max;

    }
}