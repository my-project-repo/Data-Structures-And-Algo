class Solution {

    public int numWaterBottles(int numBottles, int numExchange) {
        int conv = 0;
        while (numBottles >= numExchange) {
            int div = numBottles / numExchange;
            conv += numExchange * div;
            numBottles -= numExchange * div;
            numBottles += div;
        }
        return conv + numBottles;
    }
}