class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i = 0, j = piles.length - 2, res = 0;
        while (i < j) {
            res += piles[j];
            j-= 2;
            i++;
        }
        return res;
    }
}