class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int idx = 0, edx = arr.length - 1;
        while (idx < edx) {
            int mid = (edx + idx) / 2;
            if (arr[mid] > arr[mid + 1]) {
                edx = mid;
            } else
                idx = mid+1;
        }
        return edx;
    }
}