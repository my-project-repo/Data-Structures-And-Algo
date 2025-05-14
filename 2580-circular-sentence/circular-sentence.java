class Solution {
    public boolean isCircularSentence(String sentence) {
        int n = sentence.length();
        if (sentence.charAt(0) != sentence.charAt(n - 1))
            return false;
        int point = sentence.indexOf(" ");
        if (point == -1)
            return true;
        while (point != -1) {
            if (sentence.charAt(point - 1) != sentence.charAt(point + 1))
                return false;
            point = sentence.indexOf(" ", point + 1);
        }
        return true;
    }
}