class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        long score = 0;
        for (int i : nums)
            max.add(i);
        while (k-- > 0) {
            int val = max.poll();
            score += val;
            max.add((val + 2) / 3);
        }

        return score;
    }
}