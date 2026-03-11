class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int index = 0, res = 0;
        while (n > 0)
        {
            if ( (n & 1 ) == 0)
            res += (int) Math.pow(2,index);
            n >>= 1;
            index++;
        }
        return res;
    }
}