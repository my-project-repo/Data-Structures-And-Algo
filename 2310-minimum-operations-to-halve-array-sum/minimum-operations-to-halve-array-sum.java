class Solution {
    public int halveArray(int[] nums) {
        Queue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int res = 0;
        double find = 0.0, sum = 0.0;
        for (int i : nums) {
            maxHeap.add(i * 1.0);
            sum += i;
        }
        find = sum / 2;
        while (sum > find) {
            res++;
            double val = maxHeap.poll();
            sum -= val / 2;
            maxHeap.add(val / 2);
        }
        return res;
    }
}