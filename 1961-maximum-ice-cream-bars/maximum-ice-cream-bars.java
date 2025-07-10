class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res = 0;
        for (int i : costs) {
            if (i > coins)
                break;
            coins -= i;
            res++;
        }
        return res;
    }
}