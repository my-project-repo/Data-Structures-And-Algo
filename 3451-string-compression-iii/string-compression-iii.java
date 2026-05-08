class Solution {
    public String compressedString(String word) {
        char[] ch = word.toCharArray();
        StringBuilder res = new StringBuilder();
        int i, count = 1;
        for (i = 1; i < ch.length; i++) {
            if (ch[i] == ch[i - 1]) {
                count++;
                if (count == 9) {
                    res.append("9").append(ch[i]);
                    count = 0;
                }
            } else {
                if (count > 0)
                    res.append(String.valueOf(count)).append(ch[i - 1]);
                count = 1;
            }
        }
        if (count > 0)
            res.append(String.valueOf(count)).append(ch[i - 1]); // last
        return res.toString();
    }
}