class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // slidingWindow
        int res = 0, window = 0, p = 0;
        for (int i = 0; i < k; i++) {
            window += arr[i];
        }
        if ((window / k) >= threshold)
            res++;
        for (int i = k; i < arr.length; i++) {
            window -= arr[p++];
            window += arr[i];
            if ((window / k) >= threshold)
                res++;
        }
        return res;
    }
}