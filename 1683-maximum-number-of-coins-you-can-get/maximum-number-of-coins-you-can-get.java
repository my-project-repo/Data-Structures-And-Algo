class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i = 0, k = piles.length - 1, j = k - 1, res = 0;
        while (i < j && j < k) {
            res += piles[j];
            k-= 2;
            j-= 2;
            i++;
        }
        return res;
    }
}