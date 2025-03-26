import java.util.Arrays;

class Solution {
    public int minOperations(int[][] grid, int x) {
        int[] arr = new int[grid.length * grid[0].length];
        int p = 0, mid, res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                arr[p++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        mid = arr[arr.length / 2];
        for (int i : arr) {
            if (i == mid)
                continue;
            int absolute = Math.abs(i - mid);
            if (absolute % x != 0)
                return -1;
            else
                res += absolute / x;
        }
        return res;
    }
}