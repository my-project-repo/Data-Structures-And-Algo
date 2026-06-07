class Solution {
    public int minimumSwaps(int[] nums) {
        int nonzero = 0 , zero = nums.length-1 , res = 0;
        while (nonzero < zero)
        {
            if (nums[zero] == 0) zero--;
            else if (nums[nonzero] != 0) nonzero++;
            else
            {
                int t = nums[nonzero];
                nums[nonzero] = nums[zero];
                nums[zero] = t;
                res++;
                zero--; nonzero++;
            }
        }
        return res;
    }
}