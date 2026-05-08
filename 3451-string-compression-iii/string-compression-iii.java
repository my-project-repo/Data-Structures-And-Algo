class Solution {
    public String compressedString(String word) {
        char[] ch = word.toCharArray();
        StringBuilder res = new StringBuilder();
        int i, count = 1;
        for (i = 1; i <= ch.length; i++) {
            while (i < ch.length && ch[i] == ch[i - 1] && count < 9) {
                i++;
                count++;
            }
            res.append(String.valueOf(count)).append(ch[i - 1]);
            count = 1;
        }
        return res.toString();
    }
}