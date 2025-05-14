class Solution {
    public boolean isCircularSentence(String sentence) {
        char[] arr = sentence.toCharArray();
        int n = arr.length;
        char last = ' ';
        if (sentence.charAt(0) != sentence.charAt(n - 1))
            return false;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && Character.isLetter(arr[i]) && arr[i + 1] == ' ')
                last = arr[i];
            if (i < n - 1 && arr[i] == ' ' && Character.isLetter(arr[i + 1])) {
                if (last != arr[i + 1])
                    return false;
            }
        }
        return true;
    }
}