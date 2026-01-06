class Solution {
    public int maxVowels(String s, int k) {
        int vowels = 0, res = 0, l = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < k; i++) {
            if (isVowel(ch[i]))
                vowels++;
        }
        res = Math.max(res, vowels);
        for (int i = k; i < ch.length; i++) {
            if (isVowel(ch[l++]))
                vowels--;
            if (isVowel(ch[i]))
                vowels++;
            res = Math.max(res, vowels);

        }
        return res;
    }

    boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}