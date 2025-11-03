class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int p = 0, n = nums.length;
        int[] index = new int[n];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == key)
                index[p++] = i;
        }
        for (int i = 0; i < n; i++) {
            if (helper(index, i , k , p))
                res.add(i);
        }
        return res;

    }

    boolean helper(int[] arr, int k , int p, int n) {
        for (int i = 0; i < n; i++) {
            if (Math.abs(k - arr[i]) <= p)
                return true;
        }
        return false;
    }
}