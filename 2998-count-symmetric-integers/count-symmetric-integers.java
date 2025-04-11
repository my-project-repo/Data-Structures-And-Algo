class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++) {
            if (sumEq(i))
                res++;
        }
        return res;
    }

    boolean sumEq (int n )
    {
        int p = 0, sumOne = 0, sumTwo = 0 , size = (""+n).length();
        if (size % 2 != 0) return false;
        while (n != 0)
        {
            if (p < size/2)
            sumOne += n % 10;
            else
            sumTwo += n%10;
            n/=10;
            p++;
        }
        return sumOne == sumTwo;
    }
}