class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for (int i : nums) {
            maxOr |= i; // or of all the digits
        }
        return countSubSets(0, nums, 0, maxOr);
    }

    int countSubSets(int idx, int[] nums, int currOr, int maxOr) {
        if (idx == nums.length) {
            if (currOr == maxOr)
                return 1;
            return 0;
        }
        int include = countSubSets(idx + 1, nums, currOr | nums[idx], maxOr);
        int exclude = countSubSets(idx + 1, nums, currOr, maxOr);
        return include + exclude;
    }
}