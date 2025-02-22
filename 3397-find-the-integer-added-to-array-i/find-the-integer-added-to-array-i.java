class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int minOne = Integer.MAX_VALUE, minTwo = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            minOne = Math.min(minOne, nums1[i]);
            minTwo = Math.min(minTwo, nums2[i]);
        }
        return minTwo - minOne;
    }
}