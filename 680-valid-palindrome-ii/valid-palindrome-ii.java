class Solution {
    public boolean validPalindrome(String s) {
        char[] ch = s.toCharArray();
        int idx = 0, edx = ch.length - 1;
        while (idx < edx) {
            if (ch[idx] == ch[edx]) {
                idx++;
                edx--;
            } else
                return isValid(ch, idx + 1, edx) || isValid(ch, idx, edx - 1);

        }
        return true;
    }

    boolean isValid(char[] ch, int idx, int edx) {
        while (idx < edx) {
            if (ch[idx] != ch[edx])
                return false;

            idx++;
            edx--;
        }
        return true;
    }
}