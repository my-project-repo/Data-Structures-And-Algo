class Solution {
    public int longestBalanced(int[] nums) {
        Set<Integer> set;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            set = new HashSet<>();
            int even = 0, odd = 0;
            for (int j = i; j < nums.length; j++) {
                if (!set.contains(nums[j])) {
                    if ((nums[j] & 1) == 0)
                        even++;
                    else
                        odd++;
                }
                if (even == odd)
                    max = Math.max(max, j - i + 1);
                set.add(nums[j]);
            }
        }
        return max;
    }
}