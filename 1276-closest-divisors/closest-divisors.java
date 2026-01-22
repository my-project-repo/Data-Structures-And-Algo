class Solution {
    public int[] closestDivisors(int num) {
        int [] r1 = getPair(num+1);
        int []r2 = getPair(num+2);
        if (Math.abs(r1[1] - r1[0]) > Math.abs(r2[1] - r2[0]))
        return r2;
        else return r1;

    }

    int[] getPair(int num) {
        int n = (int) Math.sqrt(num);
        for (int i = n; i >= 1; i--) {
            if (num % i == 0)
                return new int[] { i, num / i };
        }
        return new int []{1,num};

    }
}