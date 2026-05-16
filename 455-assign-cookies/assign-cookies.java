class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Thread t1 = new Thread(() -> {Arrays.sort(g);});
        Thread t2 = new Thread(() -> {Arrays.sort(s);});

        t1.start();
        t2.start();

        try {
        t1.join();
        t2.join();
        }
        catch(InterruptedException e) {

        }
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