class Solution {
    public int numberOfChild(int n, int k) {
        int i = 0, j = 0;
        boolean flag = true;
        while (j != k) {
            if (!flag) {
                i--;
            } else {
                i++;
            }
            j++;
            if (i == 0 || i == n - 1)
                flag = !flag;
        }
        return i;
    }
}