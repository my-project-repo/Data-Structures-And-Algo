class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
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
        for (int i = 0; i <= top; i++) {
            str.append(st[i]);
        }
        return str.toString();
    }
}