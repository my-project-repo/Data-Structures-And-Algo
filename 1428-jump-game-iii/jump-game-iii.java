class Solution {
    public boolean canReach(int[] arr, int start) {
        return search (arr,start,new boolean[arr.length]);
    }

    boolean search(int[] arr, int start, boolean[] isVisited) {
        if (start < 0 || start >= arr.length)
            return false;
        else if (arr[start] == 0)
            return true;
        else if (isVisited[start]) return false;
            isVisited[start] = true;
            boolean x = search(arr, start - arr[start],isVisited);
            boolean y = search(arr, start + arr[start],isVisited);
        return x || y ;
    }
}