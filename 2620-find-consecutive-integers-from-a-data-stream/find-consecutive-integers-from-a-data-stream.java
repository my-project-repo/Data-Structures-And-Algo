class DataStream {
    int capacity;
    int val;
    int counter;

    public DataStream(int value, int k) {
        capacity = k;
        val = value;
        counter = 0;
    }

    public boolean consec(int num) {
        if (num == val)
            counter++;
        else
            counter = 0;
        return counter >= capacity;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */