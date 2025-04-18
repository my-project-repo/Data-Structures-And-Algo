class CustomStack {
    int[] arr;
    int capacity, index;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        capacity = maxSize;
        index = -1;
    }

    public void push(int x) {
        if (index == capacity - 1)
            return;
        arr[++index] = x;
    }

    public int pop() {
        if (index == -1)
            return -1;
        return arr[index--];
    }

    public void increment(int k, int val) {
        int min = Math.min(k, index + 1);
        for (int i = 0; i < min; i++) {
            arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */