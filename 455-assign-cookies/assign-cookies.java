class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int idx = 0, idx2 = 0, edx = g.length, edx2 = s.length , res = 0;
        while (idx < edx && idx2 < edx2) {
            if (g[idx] > s[idx2])
                idx2++;
            else {
                res++;
                idx++;
                idx2++;
            }
        }

        return res;
    }
}