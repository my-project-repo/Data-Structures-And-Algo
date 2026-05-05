class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int l = 0, p = 0;
        int[] ans = new int[nums.length - k + 1];
        for (int r = 0; r < nums.length; r++) {
            while (!deque.isEmpty() && nums[r] > nums[deque.peekLast()])
                deque.pollLast();

            deque.add(r);

            if (r - l + 1 == k) {
                ans[p++] = nums[deque.peek()];
                if (nums[l] == nums[deque.peek()])
                    deque.poll();
                l++;
            }

        }

        return ans;
    }
}