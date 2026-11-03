class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE , sum = 0;
        for (int i : nums) {
            sum += i;
            max = Math.max(max,i);
        }
        return max * nums.length - sum;
    }
}