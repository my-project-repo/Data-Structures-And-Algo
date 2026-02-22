class Solution {
    public int binaryGap(int n) {
        int count = 0 , val = 0,max = 0;
        while (n > 0) {
            int dig = n & 1;
            if (dig == 1) {
                count++;
                if (count == 2) {
                    max = Math.max(max, val);
                    count = 1;
                    val = 0;
                }

            }
            if (count == 1)
              val++;

              n = n >> 1;
        }
        return max;
    }
}