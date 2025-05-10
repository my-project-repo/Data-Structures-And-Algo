class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sumOne = 0, sumTwo = 0, zeroOne = 0, zeroTwo = 0;
        for (int i : nums1) {
            if (i == 0)
                zeroOne++;
            else
                sumOne += i;
        }
        for (int i : nums2) {
            if (i == 0)
                zeroTwo++;
            else
                sumTwo += i;
        }
        long minOne = sumOne + zeroOne;
        long minTwo = sumTwo + zeroTwo;
        if (minOne > minTwo && zeroTwo == 0)
            return -1;
        else if (minTwo > minOne && zeroOne == 0)
            return -1;
        return Math.max(minOne, minTwo);
    }
}