class Solution {
    public String processStr(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!str.isEmpty()) {
                if (ch == '#')
                    str.append(str);
                else if (ch == '*')
                    str.deleteCharAt(str.length() - 1);
                else if (ch == '%')
                    str.reverse();
            }
            if (Character.isLetter(ch))
                str.append(ch);
        }

        return str.toString();
    }
}