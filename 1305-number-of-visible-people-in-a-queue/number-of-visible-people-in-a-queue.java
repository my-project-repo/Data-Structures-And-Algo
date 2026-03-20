class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            int height = heights[i], counter = 0;
            while (!st.isEmpty() && height >= st.peek())
            {
                counter++;
                st.pop();
            }
            heights[i] = counter + (st.isEmpty() ? 0 : 1);
            st.push(height);
        }
        return heights;
    }
}