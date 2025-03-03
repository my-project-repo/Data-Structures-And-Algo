import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list = new ArrayList<>();
        int p = 0,piv=0;
        // smaller
        for (int i : nums)
        {
            if (i<pivot)
                nums[p++] = i;
            else if (i==pivot) piv++;
            else list.add(i);
        }
        // pivot
        for (int i = 0;i<piv;i++)
        {
            nums[p++] = pivot;
        }
        // larger
        for (int i : list)
        {
            nums[p++] = i;
        }
        return  nums;
    }
}