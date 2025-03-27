class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotateFix(nums,0,nums.length-1);
        rotateFix(nums,0,k-1);
        rotateFix(nums,k,nums.length-1);
    }
    public void rotateFix (int [] nums , int start , int end)
    {
        while (start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }
}