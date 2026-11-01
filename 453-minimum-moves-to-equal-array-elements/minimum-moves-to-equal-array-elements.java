class Solution {
    public int minMoves(int[] nums) {
        int ans = 0, min = Integer.MAX_VALUE;
        for (int i : nums) {
            min = Math.min(min, i);
        }
        for (int i : nums) {
            ans += i - min;
        }

        return ans;
    }
}