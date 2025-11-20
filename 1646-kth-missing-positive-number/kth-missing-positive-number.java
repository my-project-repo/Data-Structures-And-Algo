class Solution {
    public int findKthPositive(int[] arr, int k) {
        int p = 0 , missing = 0;
        for (int i = 1; i < arr[arr.length - 1]; i++) {
            if (arr[p] == i)
                p++;
            else
                missing++;
                if (missing == k)
                return i;
        }
        return ( arr[arr.length-1] - missing ) + k;
    }
}