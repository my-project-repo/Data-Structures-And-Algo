class Solution {
    public int halveArray(int[] nums) {
        double sum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> Double.compare(b, a));
        for (int n : nums) {
            sum += n;
            pq.add(n + 0.0);
        }
        double curSum = 0;
        int ans = 0;
        while (curSum < (sum / 2)) {
            double c = pq.poll();
            curSum += c / 2;
            pq.add(c / 2);
            ans += 1;
        }
        return ans;
    }
}