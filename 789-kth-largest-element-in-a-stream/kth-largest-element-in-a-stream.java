class KthLargest {
    PriorityQueue<Integer> min;
    int k;

    public KthLargest(int k, int[] nums) {
        min = new PriorityQueue<>();
        this.k = k;
        for (int i : nums) {
            min.add(i);
            if (min.size() > this.k)
                min.poll();
        }

    }

    public int add(int val) {
        min.add(val);
        if (min.size() > k)
            min.poll();
        return min.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */