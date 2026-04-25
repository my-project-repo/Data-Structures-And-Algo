class StockSpanner {
    int index = 0;
    List<Integer> list;
    Stack<Integer> st;

    public StockSpanner() {
        list = new ArrayList<>();
        st = new Stack<>();
    }

    public int next(int price) {
        while (!st.isEmpty() && list.get(st.peek()) <= price) {
            st.pop();
        }
        int val = st.isEmpty() ? index + 1 : index - st.peek();
        st.push(index);
        list.add(price);
        index++;
        return val;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */