class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double res = 0.0;
        int edx1 = prices.length - 1, edx2 = discounts.length - 1;
        while (edx1 >= 0 && edx2 >= 0) {
            res += (double) (prices[edx1] * (100 - discounts[edx2])) / 100;
            edx1--;
            edx2--;
        }

        while (edx1 >= 0) {
            res += prices[edx1--];
        }
        return res;
    }
}