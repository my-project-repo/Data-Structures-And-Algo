class Solution {
    public boolean isCircularSentence(String sentence) {
        sentence = sentence.trim();
        int n = sentence.length();
        char first = ' ', last = ' ';
        if (sentence.charAt(0) != sentence.charAt(n - 1))
            return false;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && Character.isLetter(sentence.charAt(i)) && sentence.charAt(i + 1) == ' ')
                last = sentence.charAt(i);
            if (i < n - 1 && sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i + 1))) {
                first = sentence.charAt(i + 1);
                if (last != first)
                    return false;
            }
        }
        return true;
    }
}