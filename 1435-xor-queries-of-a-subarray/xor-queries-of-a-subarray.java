class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans = new int[arr.length];
        int[] res = new int[queries.length];
        int p = 0;
        ans[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            ans[i] = arr[i] ^ ans[i - 1];
        for (int[] q : queries) {
            int i = q[0], j = q[1];
            if (i == 0)
                res[p] = ans[j];
            else
                res[p] = ans[j] ^ ans[i - 1];
            p++;
        }
        return res;
    }
}