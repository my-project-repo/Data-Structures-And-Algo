class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length, idx = 0, mid, res = 0;
        int[] arr = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[idx++] = grid[i][j];
            }
        }

        int mod = arr[0] % x;
        for (int val : arr) {
            if (val % x != mod) return -1;
        }

        Arrays.sort(arr);
        mid = arr[arr.length / 2];
        
        for (int i : arr) res += (Math.abs(i - mid) / x);

        return res;
    }
}