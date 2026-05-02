class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int odd = 0 , even = nums.length-1;
        while (odd < even)
        {
            if (nums[odd] % 2 == 0)
            odd++;
            else if (nums[even] % 2 != 0)
            even--;
            else
            {
                int t = nums[odd];
                nums[odd] = nums[even];
                nums[even] = t;
                odd++; even--;
            }
        }
        return nums;
    }
}