class Solution {
    public int maximumRobots(int[] C, int[] R, long budget) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = C.length, left = 0, max = 0;
        long sum = 0;

        for (int r = 0; r < n; r++) {

            // Maintain decreasing deque
            while (!st.isEmpty() && C[r] >= C[st.peekLast()])
                st.pollLast();

            st.addLast(r);

            sum += R[r];

            // Shrink window while invalid
            while (!st.isEmpty() &&
                   C[st.peekFirst()] + (long)(r - left + 1) * sum > budget) {

                if (st.peekFirst() == left)
                    st.pollFirst();

                sum -= R[left];
                left++;
            }

            max = Math.max(max, r - left + 1);
        }

        return max;
    }
}