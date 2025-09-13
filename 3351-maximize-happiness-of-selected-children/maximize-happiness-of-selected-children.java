class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long minus = 0, res = 0;
        Queue<Integer> max = new PriorityQueue<>((a,b)->b-a);
        for (int i : happiness)
        {
            max.add(i);
        }
        while (k > 0 && !max.isEmpty())
        {
            res += Math.max(max.poll() - minus , 0);
            minus++;
            k--;
        }
        return res;
    }
}