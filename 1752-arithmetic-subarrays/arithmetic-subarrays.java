class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        for (int i = 0;i<l.length;i++)
        {
            list.add(isValid(nums,l[i],r[i]));
        }
        return list;
        
    }
    boolean isValid (int [] nums , int l , int r)
    {
        int [] arr = new int [r - l + 1];
        int p = 0;
        for (int i = l;i<=r;i++)
        {
            arr[p++] = nums[i];
        }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0]; // common difference
        for (int i = 1;i<arr.length;i++)
        {
            if (arr[i] - arr[i-1] != diff) return false;
        }
        return true;
    }
}