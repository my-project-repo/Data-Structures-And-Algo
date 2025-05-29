class Solution {
    public int pivotInteger(int n) {
        double total = n * (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            double sum = i * (i + 1) / 2;
            int tot = (int) (total - sum) + i;
            if (tot < sum)
                break;
            if (tot == sum)
                return i;
        }
        return -1;
    }
}