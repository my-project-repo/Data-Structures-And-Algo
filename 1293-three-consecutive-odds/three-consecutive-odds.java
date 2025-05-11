class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int counter = 0;
        for (int i : arr) {
            if (counter >= 3)
                return true;
            counter = (i % 2 == 0) ? 0 : counter + 1;
        }
        return counter >= 3;
    }
}