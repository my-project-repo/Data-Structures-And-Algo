class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // bruteForce
        int max = Integer.MIN_VALUE, res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                res = i;
            } else
                break;
        }
        return res;
    }
}