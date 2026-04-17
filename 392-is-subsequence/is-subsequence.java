class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j])
                i++;
            j++;
        }
        return i == a.length;
    }
}