class Solution {
    public int minimumOperations(int[] nums) {
        int counter = 0;
        for (int i : nums)
            if (i % 3 == 0)
                counter++;

                return nums.length - counter;
    }
}