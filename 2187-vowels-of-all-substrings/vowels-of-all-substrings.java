class Solution {
    public long countVowels(String word) {
        long res = 0;
        int N = word.length();
        for (int i = 0; i < N; i++) {
            if (isVowel(word.charAt(i))) {
                res += (long)(N - i) * (i + 1);
            }
        }

        return res;
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}