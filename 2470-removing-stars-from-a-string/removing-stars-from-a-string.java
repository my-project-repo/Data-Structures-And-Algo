class Solution {
    public String removeStars(String s) {
        int n = s.length(), top = -1;
        char[] st = new char[n];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (top == -1 && ch == '*')
                continue;
            else if (top != -1 && ch == '*')
                top--;
            else
                st[++top] = ch;
        }
        return new String(st, 0, top + 1);
    }
}