class Solution {
    static int res = 0;
    static int maxOr = 0;

    public int countMaxOrSubsets(int[] nums) {
        res = 0;
        maxOr = 0;
        for (int i : nums) {
            maxOr |= i; // or of all the digits
        }
        countSubSets(0, nums, 0);
        return res;
    }

    void countSubSets(int idx, int[] nums, int currOr) {
        if (idx == nums.length) {
            if (currOr == maxOr)
                res++;
            return;
        }
        countSubSets(idx + 1, nums, currOr | nums[idx]);
        countSubSets(idx + 1, nums, currOr);
    }
}