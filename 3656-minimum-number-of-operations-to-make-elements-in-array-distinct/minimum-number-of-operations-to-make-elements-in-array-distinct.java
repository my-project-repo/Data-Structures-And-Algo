class Solution {
    public int minimumOperations(int[] nums) {
        double output = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(nums[i]))
                break;
            output++;
            set.add(nums[i]);
        }
        output = Math.ceil((nums.length - output) / 3);
        return (int) output;
    }
}