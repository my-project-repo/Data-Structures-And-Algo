class Solution {
    public int arrangeCoins(int n) {
        int counter = 0, temp = n;
        for (int i = 1; i <= n / 2 + 1; i++) {
            temp -= i;
            if (temp < 0)
                break;
            counter++;
        }
        return counter;
    }
}