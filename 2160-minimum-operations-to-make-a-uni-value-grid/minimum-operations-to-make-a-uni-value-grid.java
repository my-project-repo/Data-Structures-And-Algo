class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length, idx = 0, mid, res = 0;
        int[] arr = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[idx++] = grid[i][j];
            }
        }

        Arrays.sort(arr);
        mid = arr[arr.length / 2];
        
        for (int i : arr) {
            if (i == mid)
                continue;
            int val = Math.abs(i - mid);
            if (val % x != 0)
                return -1;
            res += (val / x);
        }

        return res;
    }
}