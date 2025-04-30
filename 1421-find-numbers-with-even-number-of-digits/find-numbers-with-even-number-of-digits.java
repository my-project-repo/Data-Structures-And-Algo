class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int i : nums) {
            if (((int) Math.log10(i) + 1) % 2 == 0)
                counter++;
        }
        return counter;
    }

}