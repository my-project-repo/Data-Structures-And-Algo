class Solution {
    public void sortColors(int[] nums) {
        // zero
        int nonZero = 0, zero = 0, one, nonOne = 0;
        for (int num : nums) {
            if (num == 0) {
                swap(zero, nonZero, nums);
                zero++;
            }
            nonZero++;
        }
        // one
        one = zero;
        for (int num : nums) {
            if (num == 1) {
                swap(one, nonOne, nums);
                one++;
            }
            nonOne++;
        }
    }

    void swap(int n, int n2, int[] arr) {
        int temp = arr[n];
        arr[n] = arr[n2];
        arr[n2] = temp;
    }
}