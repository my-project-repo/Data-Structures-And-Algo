class Solution {
    public int maxProduct(int[] nums) {
        int max = 0, secondMax = 0;
        for (int i : nums) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax) {
                secondMax = i;
            }
        }

        return (max - 1) * (secondMax - 1);
    }
}