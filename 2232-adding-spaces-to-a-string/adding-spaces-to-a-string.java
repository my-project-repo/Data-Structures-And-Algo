class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int i = 0 , p = 0, n = spaces.length;
        while (i < s.length())
        {
            if (p < n && spaces[p] == i)
            {
                str.append(" ");
                p++;
            }
            str.append(s.charAt(i++));
        }
        return str.toString();
    }
}