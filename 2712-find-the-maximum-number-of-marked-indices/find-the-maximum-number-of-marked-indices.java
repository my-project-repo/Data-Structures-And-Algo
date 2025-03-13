class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int idx = 0, edx = (nums.length + 1) / 2, count = 0;
        for (; edx < nums.length; edx++)
            if (2 * nums[idx] <= nums[edx])
                idx++;
        return idx * 2;

    }
}