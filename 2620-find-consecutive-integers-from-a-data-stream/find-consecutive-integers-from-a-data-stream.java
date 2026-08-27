class DataStream {
    Queue<Integer> q;
    int capacity;
    int val;
    int counter;

    public DataStream(int value, int k) {
        q = new LinkedList<>();
        capacity = k;
        val = value;
        counter = 0;
    }

    public boolean consec(int num) {
        if (q.size() == capacity) {
            if (q.peek() == val)
                counter--;
            q.poll();
        }
        if (num == val)
            counter++;

        q.add(num);

        return counter == capacity;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */