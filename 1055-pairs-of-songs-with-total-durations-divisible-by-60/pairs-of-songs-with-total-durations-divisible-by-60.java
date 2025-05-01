class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int res = 0;
        int count[] = new int[60];
        for (int t : time) {
            int remainder = t % 60;
            res += count[(60 - remainder) % 60];
            count[remainder]++;
        }
        return res;
    }
}