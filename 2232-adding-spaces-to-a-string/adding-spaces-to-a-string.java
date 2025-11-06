class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        char [] ch = s.toCharArray();
        int p = 0, n = spaces.length;
        for (int i = 0; i < ch.length; i++) {
            if (p < n && i == spaces[p]) {
                str.append(" ");
                p++;
            }
                str.append(ch[i]);
        }
        return str.toString();
    }
}