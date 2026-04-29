class Solution {
    int max = 0 , idx = -1 , edx = -1;
    public String longestPalindrome(String s) {
        char [] ch = s.toCharArray();
        for (int i = 0;i<ch.length;i++)
        {
            expand(ch,i,i); // odd;
            expand(ch,i,i+1); // even
        }

        return (idx != -1 && edx != -1) ? s.substring(idx,edx+1) : "";
    }

    void expand(char[] ch, int l, int r) {

        while (l >= 0 && r < ch.length && ch[l] == ch[r]) {
            l--;
            r++;
        }
        int size = r - l - 1;
        if (size > max) {
            max = size;
            idx = l + 1;
            edx = r - 1;
        }
    }
}