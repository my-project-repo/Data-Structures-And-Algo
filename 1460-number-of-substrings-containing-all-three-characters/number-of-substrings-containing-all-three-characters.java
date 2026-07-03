class Solution {
    public int numberOfSubstrings(String s) {
        int a = 0, b = 0, c = 0, res = 0, l = 0 , n = s.length();
        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            if (ch == 'a')
                a++;
            else if (ch == 'b')
                b++;
            else
                c++;
            while (a > 0 && b > 0 && c > 0) {
                res += n - r;
                char left = s.charAt(l);
                if (left == 'a')
                    a--;
                else if (left == 'b')
                    b--;
                else
                    c--;
                l++;
            }
        }

        return res;
    }
}