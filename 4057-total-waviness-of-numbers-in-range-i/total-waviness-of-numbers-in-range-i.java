class Solution {
    public int totalWaviness(int num1, int num2) {
        int res = 0;
        for (int i = num1; i <= num2; i++) {
            res += wave(i);
        }

        return res;
    }

    int wave(int x) {
        String s = Integer.toString(x);
        int res = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            if ((ch > s.charAt(i + 1) && ch > s.charAt(i - 1)) || (ch < s.charAt(i + 1) && ch < s.charAt(i - 1)))
                res++;
        }
        return res;
    }
}