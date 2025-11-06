class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int p = 0, n = spaces.length;
        for (int i = 0; i < s.length(); i++) {
            if (p < n && i == spaces[p]) {
                str.append(" ");
                p++;
            }
                str.append(s.charAt(i));
        }
        return str.toString();
    }
}