import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int minOperations(int[][] grid, int x) {
        int[] arr = new int[grid.length * grid[0].length];
        int p = 0, mid, res = 0;
        for (int[] a : grid) {
            for (int i : a) {
                arr[p++] = i;
            }
        }
        Arrays.sort(arr);
        mid = arr.length / 2;
        for (int i : arr) {
            if (Math.abs(i - arr[mid]) % x != 0)
                return -1;
            else
                res += Math.abs(i - arr[mid]) / x;
        }
        return res;
    }
}