class Solution {
    public int countPoints(String rings) {
        int res = 0;
        int[] b = new int[10];
        int[] r = new int[10];
        int[] g = new int[10];
        char[] ch = rings.toCharArray();
        for (int i = 1; i < ch.length; i += 2) {
            if (Character.isDigit(ch[i])) {
                int idx = ch[i] - '0';
                if (ch[i - 1] == 'B')
                    b[idx]++;
                else if (ch[i - 1] == 'R')
                    r[idx]++;
                else
                    g[idx]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (b[i] >= 1 && r[i] >= 1 && g[i] >= 1)
                res++;
        }
        return res;
    }
}