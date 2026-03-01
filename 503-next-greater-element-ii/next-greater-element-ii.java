class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && nums[i] >= nums[stk.peek()])
                stk.pop();
            stk.push(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && nums[i] >= nums[stk.peek()]) {
                stk.pop();
            }
            ans[i] = stk.isEmpty() ? -1 : nums[stk.peek()];
            stk.push(i);
        }
        return ans;
    }
}