class Solution {
    public int compress(char[] chars) {
        int p = 0, count = 1, i;
        for (i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    chars[p++] = chars[i - 1];
                    String c = String.valueOf(count);
                    for (int j = 0; j < c.length(); j++)
                        chars[p++] = c.charAt(j);
                } else
                    chars[p++] = chars[i - 1];

                count = 1;
            }
        }
        if (count > 1) {
            chars[p++] = chars[i - 1];
            String c = String.valueOf(count);
            for (int j = 0; j < c.length(); j++)
                chars[p++] = c.charAt(j);
        } else
            chars[p++] = chars[i - 1];

        return p;
    }
}