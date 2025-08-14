class Solution {
    public String largestGoodInteger(String num) {
        int max = -99;
        char[] ch = num.toCharArray();
        for (int i = 2; i < ch.length; i++) {
            if (ch[i] == ch[i - 1] && ch[i - 1] == ch[i - 2]) {
                max = Math.max(max, ( ch[i] - '0' ) * 111 );
            }
        }
        return (max == -99) ? "" : (max == 0) ? "000" : max+"";
    }
}