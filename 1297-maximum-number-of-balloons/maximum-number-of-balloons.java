class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0, max = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'b')
                b++;
            else if (ch == 'a')
                a++;
            else if (ch == 'l')
                l++;
            else if (ch == 'o')
                o++;
            else if (ch == 'n')
                n++;

        }

        o /= 2;
        l /= 2;

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}