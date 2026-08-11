class Solution {
    public boolean validPalindrome(String s) {
        int idx = 0, edx = s.length() - 1;
        while (idx < edx) {
            if (s.charAt(idx) == s.charAt(edx)) {
                idx++;
                edx--;
            } else
                return isValid(s, idx + 1, edx) || isValid(s, idx, edx - 1);

        }
        return true;
    }

    boolean isValid(String s, int idx, int edx) {
        while (idx < edx) {
            if (s.charAt(idx) != s.charAt(edx))
                return false;

            idx++;
            edx--;
        }
        return true;
    }
}