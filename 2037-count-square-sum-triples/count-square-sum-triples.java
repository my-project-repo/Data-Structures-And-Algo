class Solution {
    public int countTriples(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int pro = (i * i) + (j * j);
                int root = (int) Math.sqrt(pro);
                if (root * root == pro && root <= n) 
                res++;
            }
        }
        return res;
    }
}