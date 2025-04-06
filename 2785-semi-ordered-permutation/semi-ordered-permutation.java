class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length, first = 0, last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                first = i;
            if (nums[i] == n)
                last = i;
            if (first != 0 && last != 0)
                break;
        }
        return first + (n - last - 1) - ((first > last) ? 1 : 0);
    }
}