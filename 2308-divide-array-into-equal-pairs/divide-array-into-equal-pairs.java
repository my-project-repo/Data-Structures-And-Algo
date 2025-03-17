class Solution {
    public boolean divideArray(int[] nums) {
        int[] frequency = new int[501];
        for (int i : nums) {
            frequency[i]++;
        }
        for (int i = 0; i < 501; i++) {
            if (frequency[i] % 2 != 0)
                return false;
        }
        return true;
    }
}