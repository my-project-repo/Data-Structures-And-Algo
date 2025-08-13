class SmallestInfiniteSet {
    int k;
    Set<Integer> set;
    Queue<Integer> minHeap;

    public SmallestInfiniteSet() {
        k = 1;
        set = new HashSet<>();
        minHeap = new PriorityQueue<>();
    }

    public int popSmallest() {
        if (!minHeap.isEmpty() && minHeap.peek() < k)
        {
            int min = minHeap.poll();
            set.remove(min);
            return min;
        } else
        {
            k++;
            return k-1;
        }

    }

    public void addBack(int num) {
        if (k > num && !set.contains(num))
        {
            set.add(num);
            minHeap.add(num);
        }
    }
}
