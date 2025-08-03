class Solution {
    public int minStoneSum(int[] piles, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        for (int i : piles) {
            queue.add(i);
        }
        while (k-- > 0) {
            int deduct = 0;
            if (!queue.isEmpty())
                deduct = queue.poll();
            queue.add(deduct - (int) Math.floor(deduct / 2));
        }
        for (int i : queue) {
            sum += i;
        }
        return sum;
    }
}