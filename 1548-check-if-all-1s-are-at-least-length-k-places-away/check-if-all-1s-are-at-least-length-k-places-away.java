class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int zero = k;
        for (int i : nums) {
            if (i == 1) {
                if (zero < k)
                    return false;
                zero = 0;
            } else
                zero++;
        }
        return true;
    }
}