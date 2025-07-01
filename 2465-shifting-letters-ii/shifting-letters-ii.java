class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diffArr = new int[n + 1];
        char[] res = s.toCharArray();
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            if (shift[2] == 0) {
                diffArr[start] -= 1;
                diffArr[end + 1] += 1;

            } else {
                diffArr[start] += 1;
                diffArr[end + 1] -= 1;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            diffArr[i] = diffArr[i] + diffArr[i - 1];
        }
        for (int i = 0; i < n; i++) {
            int netShift = (diffArr[i] % 26 + 26) % 26;
            res[i] = (char) ('a' + (s.charAt(i) - 'a' + netShift) % 26);
        }
        return new String(res);
    }
}