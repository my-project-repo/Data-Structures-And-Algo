class Solution {
    public int maxChunksToSorted(int[] arr) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = arr.length;
        for (int i = 0;i<n;i++)
        {
            int val = arr[i];
            while (!st.isEmpty() && st.peek() > arr[i])
            {
                val = Math.max(val,st.pop());
            }
            st.push(val);
        }
        return st.size();

    }
}