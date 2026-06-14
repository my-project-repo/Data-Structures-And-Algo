class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE , pro = 1;
        for (int i : nums)
        {
            pro *= i;
            max = Math.max(max,pro);
            if (pro == 0) pro = 1;
        }
        pro = 1;
        for (int i = nums.length-1;i>=0;i--)
        {
            pro *= nums[i];
            max = Math.max(max,pro);
            if (pro == 0) pro = 1;
        }

        return max;
    }
}