class Solution {
    public int singleNonDuplicate(int[] nums) {
        int counter = 0;
        for (int i = 0;i<nums.length;i++)
        {
            if (i<nums.length-1 && nums[i]==nums[i+1])
            counter++;
            else
            {
                if (counter==0)
                return nums[i];
                else
                counter=0;
            }
        }
        return 0;
    }
}