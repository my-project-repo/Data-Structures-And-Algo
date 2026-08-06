class Solution {
    public int smallestNumber(int n, int t) {
        while (digit(n) % t != 0) {
            n++;
        }

        return n;
    }

    int digit(int num) {
        int pro = 1;
        while (num > 0) {
            pro *= num % 10;
            num /= 10;
        }
        return pro;
    }
}