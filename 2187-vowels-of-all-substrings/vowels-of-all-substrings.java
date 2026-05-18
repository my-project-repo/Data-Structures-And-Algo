class Solution {
    public long countVowels(String word) {
        boolean V[] = new boolean[26];
        V['a' - 'a'] = V['e' - 'a'] = V['i' - 'a'] = V['o' - 'a'] = V['u' - 'a'] = true;
        long res = 0;
        int N = word.length();
        for (int i = 0; i < N; i++) {
            if (V[word.charAt(i)- 'a']) {
                res += (long) (N - i) * (i + 1);
            }
        }

        return res;
    }
}