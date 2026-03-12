class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0 , i;
        for (i = 1;i<nums.length;i++)
        {
            if (nums[i] != nums[i-1])
            {
                nums[index++] = nums[i-1];
            } 
        }
        nums[index] = nums[i-1];
        return index+1;
    }
}