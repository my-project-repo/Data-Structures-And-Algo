class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int idx = 0, edx = (nums.length + 1) / 2, count = 0;
        while (edx < nums.length) {
            if (2 * nums[idx] <= nums[edx]) {
                count += 2;
                idx++;
            }
            edx++;
        }
        return count;

    }
}