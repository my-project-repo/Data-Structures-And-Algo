class Solution {
    public String largestGoodInteger(String num) {
        String res = "";
        char[] ch = num.toCharArray();
        for (int i = 2; i < ch.length; i++) {
            if (ch[i] == ch[i - 1] && ch[i - 1] == ch[i - 2]) {
                String dummy = "" + ch[i] + ch[i] + ch[i];
                if (dummy.compareTo(res) > 0)
                    res = dummy;
            }
        }
        return res;
    }
}