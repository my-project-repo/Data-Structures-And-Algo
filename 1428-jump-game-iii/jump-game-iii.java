class Solution {
    public boolean canReach(int[] arr, int start) {
        return search (arr,start,new Boolean[arr.length]);
    }

    boolean search(int[] arr, int start, Boolean[] dp) {
        if (start < 0 || start >= arr.length || arr[start] < 0)
            return false;
        else if (arr[start] == 0)
            return dp[start] = true;
            else if (dp[start] != null) return dp[start];
            arr[start] = -arr[start];
            boolean x = search(arr, start - arr[start],dp);
            boolean y = search(arr, start + arr[start],dp);
        return dp[start] = x || y ;
    }
}