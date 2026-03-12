class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int [] res = new int[tem.length];
        Stack<Integer> st = new Stack<>();
        for (int i = tem.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && tem[i] >= tem[st.peek()] )
            st.pop();

            res[i] = st.isEmpty() ? 0 : st.peek() - i;
            st.push(i);
        }
        return res;
    }
}