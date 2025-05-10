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
        if (zeroOne == zeroTwo && zeroTwo == 0)
            return (sumOne == sumTwo) ? sumOne : -1;
        else if (zeroOne == 0)
            return sumOne >= (sumTwo + zeroTwo) ? sumOne : -1;
        else if (zeroTwo == 0)
            return sumTwo >= (sumOne + zeroOne) ? sumTwo : -1;
        return Math.max(sumOne + zeroOne, sumTwo + zeroTwo);
    }
}