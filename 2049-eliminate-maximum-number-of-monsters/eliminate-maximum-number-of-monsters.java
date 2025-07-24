class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] time = new int[dist.length];
        int res = 0;
        for (int i = 0; i < dist.length; i++) {
            time[i] = (int) Math.ceil((double) dist[i] / speed[i]);
        }
        Arrays.sort(time);
        for (int i = 0; i < dist.length; i++) {
            if (time[i] > i)
                res++;
            else
                break;
        }
        return res;
    }
}