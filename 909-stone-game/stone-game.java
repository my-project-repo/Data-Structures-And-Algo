class Solution {
    public boolean stoneGame(int[] piles) {
        int idx = 0, edx = piles.length - 1, alice = 0, bob = 0;
        boolean myTurn = true;
        while (idx < edx) {

            if (myTurn) {
                if (piles[idx] > piles[edx]) {
                    alice += piles[idx++];
                } else {
                    alice += piles[edx--];
                }
            } else {

                if (piles[idx] > piles[edx]) {
                    bob += piles[edx--];
                } else {
                    bob += piles[idx++];
                }

            }

            myTurn = !myTurn;
        }

        return alice > bob;
    }
}