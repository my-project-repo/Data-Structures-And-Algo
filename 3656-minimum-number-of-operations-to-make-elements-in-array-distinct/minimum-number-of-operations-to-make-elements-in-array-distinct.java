class Solution {
    public int minimumOperations(int[] nums) {
        if (nums.length == 1)
            return 0;
        double output = 0;
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(nums[i]))
                break;
            output++;
            set.add(nums[i]);
        }
        output = Math.ceil((n - output) / 3);
        return (int) output;
    }
}