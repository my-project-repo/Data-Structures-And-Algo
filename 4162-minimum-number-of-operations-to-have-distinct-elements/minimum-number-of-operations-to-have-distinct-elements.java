class Solution {
    public int minOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i;
        for (i = nums.length - 1; i >= 0; i--) {
            if (set.contains(nums[i]))
                break;
            set.add(nums[i]);
        }
        return (i+3)/3;
    }
}