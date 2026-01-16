class Solution {
    public void sortColors(int[] nums) {
        // zero
        int zero = 0, nonZ = 0, one = 0, nonO = 0;
        for (int i : nums) {
            if (i == 0) {
                int temp = nums[zero];
                nums[zero] = nums[nonZ];
                nums[nonZ] = temp;
                nonZ++; // increasing index
            }
            zero++; // index pointing at zero
        }
         nonO = nonZ;
        for (int i : nums)
        {
            if (i == 1)
            {
                int temp = nums[one];
                nums[one] = nums[nonO];
                nums[nonO] = temp;
                nonO++;
            }
            one++;
        }
       
    }
}