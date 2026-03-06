class Solution {
    public int minOperations(String s) {
        int p = 0, f = 0, se = 0;
        char[] first = { '0', '1' };
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (first[p++ % 2] != c) {
                f++;
            } else
                se++;
        }
        return Math.min(f, se);
    }
}