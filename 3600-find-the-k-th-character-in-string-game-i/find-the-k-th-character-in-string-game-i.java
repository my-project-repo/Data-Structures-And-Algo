class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");
        while (str.length() < k) {
            int n = str.length();
            for (int i = 0; i < n; i++) {
                int ch = str.charAt(i);
                str.append((ch == 122) ? 'a' : (char) (ch + 1));
            }
        }
        return str.charAt(k - 1);
    }
}