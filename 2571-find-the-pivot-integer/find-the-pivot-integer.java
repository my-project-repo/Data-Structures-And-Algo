class Solution {
    public int pivotInteger(int n) {
        double total = n * (n+1)/2;
        int pivot = -1;
        for (int i = 1;i<=n;i++)
        {
            double sum = i * (i+1)/2;
            if ((total - sum)+i == sum)
            pivot = i;
        }
        return pivot;
    }
}