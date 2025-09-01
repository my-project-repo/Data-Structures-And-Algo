class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0 , max = -1;
        for (int i : nums) {
            if (sum > i)
                max = Math.max(max, sum + i);
            sum += i;
        }
        return max;
    }
}