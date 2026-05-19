class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int idx = 0 , idx2 = 0;
        while (idx < nums1.length && idx2 < nums2.length)
        {
            if (nums1[idx] == nums2[idx2]) return nums1[idx];
            else if (nums1[idx] < nums2[idx2])
            {
                idx++;
            } else
            idx2++;
        }

        return -1;
    }
}