class Solution {
    public int singleNumber(int[] nums) {
        int var = 0;
        for (int i : nums)
        {
            var ^= i;
        }
        return var;
    }
}