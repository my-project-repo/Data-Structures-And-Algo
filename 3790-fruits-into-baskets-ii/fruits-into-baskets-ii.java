class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int res = 0, sign;
        for (int i : fruits) {
            sign = 0;
            for (int j = 0; j < baskets.length; j++) {
                if (baskets[j] >= i) {
                    baskets[j] = 0;
                    sign = 1;
                    break;
                }
            }
            if (sign == 0)
                res++;
        }
        return res;
    }
}