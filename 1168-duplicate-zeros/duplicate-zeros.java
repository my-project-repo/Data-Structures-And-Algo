class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length, p = 0;
        int [] temp = new int[n];
        for (int i : arr)
        {
            temp[p++] = i;
            if (i == 0 && p < n)
            {
                temp[p++] = 0;
            }
            if (p == n)  break;
        }
        for (int i = 0;i<n;i++) arr[i] = temp[i];
    }
}