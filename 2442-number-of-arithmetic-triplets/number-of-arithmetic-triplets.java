class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
         int n = nums.length, res = 0;
        for (int i : nums) set.add(i);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] - nums[i] == diff)
                {
                    if (set.contains(diff + nums[j]))
                    res++;
                }
            }
        }
        return res;
    }
}