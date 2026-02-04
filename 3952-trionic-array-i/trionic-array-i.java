class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 1, n = nums.length;
        boolean a = false , b = false , c = false;
        while (i < n && nums[i] > nums[i-1])
        {
            i++;
            a = true;
        }
        if (!a) return a;
        while (i < n && nums[i] < nums[i-1])
        {
            i++;
            b = true;
        }
        if (!b) return b;
        while (i < n && nums[i] > nums[i-1])
        {
            i++;
            c = true;
        }
        if (!c) return c;
        return i == nums.length && a && b && c;
    }
}