class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length, max = -1;
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            res[i] = max;
            max = Math.max(max, arr[i]);
        }
        return res;
    }
}