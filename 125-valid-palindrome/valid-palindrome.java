class Solution {
    public boolean isPalindrome(String s) {
        int idx = 0, edx = s.length() - 1;
        while (idx < edx) {
            if (!Character.isLetterOrDigit(s.charAt(idx))) {
                idx++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(edx))) {
                edx--;
                continue;
            }
            char i = Character.toLowerCase(s.charAt(idx));
            char j = Character.toLowerCase(s.charAt(edx));
            if (i != j)
                return false;
            idx++;
            edx--;
        }

        return true;
    }
}