class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || (i < nums.length - 1) && (nums[i] == nums[i + 1]))
                continue;
            else {
                if (p == nums[i])
                    p++;
                else
                    break;
            }
        }
        return p;
    }
}