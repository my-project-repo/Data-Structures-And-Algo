class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");
        while (str.length() < k) {
            int n = str.length();
            for (int i = 0; i < n; i++) {
                int ch = str.charAt(i);
                str.append((char) (ch + 1));
                if (str.length() >= k) break;
            }
        }
        return str.charAt(k - 1);
    }
}