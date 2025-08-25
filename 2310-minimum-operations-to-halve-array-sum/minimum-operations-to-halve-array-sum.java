class Solution {
    public int halveArray(int[] nums) {
        Queue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int res = 0;
        double sum = 0.0;
        for (int i : nums) {
            maxHeap.add(i * 1.0);
            sum += i;
        }
        double find = sum / 2;
        while (sum > find) {
            double val = maxHeap.poll() / 2;
            sum -= val;
            maxHeap.add(val);
            res++;
        }
        return res;
    }
}