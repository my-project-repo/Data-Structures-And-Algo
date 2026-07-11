class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;
        Arrays.sort(hand);
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != -1 && !next(hand, i, groupSize))
                return false;

        }

        return true;
    }

    boolean next(int[] hand, int i, int k) {
        int n = hand[i] + 1, c = 1;
        hand[i] = -1;
        i++;
        while (i < hand.length && c < k) {
            if (hand[i] == n) {
                n++;
                c++;
                hand[i] = -1;
            }
            i++;
        }
        return c == k;
    }
}