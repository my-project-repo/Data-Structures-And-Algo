class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int res [] = new int[nums.length];
        int p = 0,piv=0;
        // smaller
        for (int i : nums)
        {
            if (i<pivot)
                res[p++] = i;
            if (i==pivot) piv++;
        }
        // pivot
        for (int i = 0;i<piv;i++)
        {
            res[p++] = pivot;
        }        
        // larger
        for (int i : nums)
        {
            if (i>pivot)
                res[p++] = i;
        }
        return  res;
        
    }
}