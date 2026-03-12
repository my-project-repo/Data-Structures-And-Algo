class Solution {
    public int findPeakElement(int[] nums) {
        int idx = 0, edx = nums.length - 1;
        while (idx <= edx) {
            int mid = idx + (edx - idx) / 2;
            if (idx == edx)
                return mid;
            else if (nums[mid] < nums[mid + 1])
                idx = mid + 1;
            else
                edx = mid;
        }
        return -1;
    }
}