class Solution {
    public int minStoneSum(int[] piles, int k) {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int sum = 0;
        for (int i : piles) {
            queue.add(i);
            sum += i;
        }
        while (k-- > 0) {
            int curr = queue.poll();
            int deduct = (int) Math.floor(curr / 2);
            queue.add(curr - deduct);
            sum -= deduct;
        }
        return sum;
    }
}