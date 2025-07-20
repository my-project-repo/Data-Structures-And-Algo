class Solution {
    public boolean winnerOfGame(String colors) {
        char[] ch = colors.toCharArray();
        int red = 0, blue = 0;
        for (int i = 2; i < ch.length; i++) {
            if (ch[i] == ch[i - 1] && ch[i - 1] == ch[i - 2]) {
                if (ch[i] == 'A')
                    red++;
                else
                    blue++;
            }
        }
        return red > blue;
    }
}