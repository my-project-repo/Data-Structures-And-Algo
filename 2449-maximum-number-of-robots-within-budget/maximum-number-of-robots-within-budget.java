class Solution {
    public int maximumRobots(int[] C, int[] R, long budget) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = C.length, left = 0, max = 0;
        long val = 0 , right = 0;
        for (int r = 0; r < n; r++) {
            while (!st.isEmpty() && C[r] >= C[st.peekLast()])
                st.pollLast();

            st.addLast(r);
            right += R[r];
            val = C[st.peekFirst()] + (long) (r - left + 1) * right;
            while (!st.isEmpty() && C[st.peekFirst()] + (long) (r - left + 1) * right > budget) {
                if (st.peekFirst() == left)
                    st.pollFirst();
                right -= R[left];
                left++;
            }

            max = Math.max(max, r - left + 1);

        }

        return max;
    }
}