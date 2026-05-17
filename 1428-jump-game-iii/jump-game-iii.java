class Solution {
    public boolean canReach(int[] arr, int start) {
        return search (arr,start);
    }

    boolean search(int[] arr, int start) {
        if (start < 0 || start >= arr.length || arr[start] < 0)
            return false;
        else if (arr[start] == 0) return true;
            arr[start] = -arr[start];
            boolean x = search(arr, start - arr[start]);
            boolean y = search(arr, start + arr[start]);
        return x || y ;
    }
}