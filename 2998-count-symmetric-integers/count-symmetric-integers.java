class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++) {
            if (sumEq(i))
                res++;
        }
        return res;
    }

    boolean sumEq(int n) {
        String var = Integer.toString(n);
        int size = var.length(), sumOne = 0, sumTwo = 0;
        if (size % 2 != 0)
            return false;
        size = size / 2;
        for (int i = 0; i < size; i++) {
            sumOne += var.charAt(i) - '0';
            sumTwo += var.charAt(size + i) - '0';

        }
        return sumOne == sumTwo;

    }
}