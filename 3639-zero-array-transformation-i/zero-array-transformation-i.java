class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        // differenceArray Approach
        int[] res = new int[nums.length + 1];
        int ans = 0;
        for (int[] query : queries) {
            res[query[0]] += 1;
            res[(query[1]) + 1] -= 1;
        }
        for (int i = 0; i < nums.length; i++) {
            ans += res[i];
            if (nums[i] > ans)
                return false;
        }
        return true;
    }
}