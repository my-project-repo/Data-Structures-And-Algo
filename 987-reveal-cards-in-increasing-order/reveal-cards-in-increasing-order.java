class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length, i = 0, j = 0;
        int[] res = new int[n];
        boolean flg = false;
        while (i < n) {
            if (res[j] == 0) {
                if (!flg) {
                    res[j] = deck[i++];
                }
                flg = !flg;
            }
            j = (j + 1) % n;
        }
        return res;
    }
}