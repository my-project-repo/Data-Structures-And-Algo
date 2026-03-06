class Solution {
    public int minOperations(String s) {
        int p = 0,q = 0 , f = 0 , se = 0;
        char[] first = { '0', '1' };
        char[] second = { '1', '0' };
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (first[p++ % 2] != c) {
                f++;
            }
            if (second[q++ % 2] != c) {
                se++;
            }
        }
        return Math.min(f,se);
    }
}