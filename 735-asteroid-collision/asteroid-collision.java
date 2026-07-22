class Solution {
    public int[] asteroidCollision(int[] A) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                int v = A[i] * -1;
                while (!st.isEmpty() && A[st.peek()] > 0 && v > A[st.peek()])
                    st.pop();

                if (!st.isEmpty() && A[st.peek()] > 0) {

                    if (A[st.peek()] == v)
                        st.pop();
                }
             else
                st.push(i);
            } else 
            st.push(i);
        }

        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--)
            ans[i] = A[st.pop()];

        return ans;
    }
}