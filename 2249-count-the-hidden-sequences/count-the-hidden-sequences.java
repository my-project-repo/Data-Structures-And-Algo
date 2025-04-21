class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long max = 0, min = 0, sum = 0;
        for (int i : differences) {
            sum += i;
            max = (max < sum) ? sum : max;
            min = (min > sum) ? sum : min;
        }
        return (int) Math.max(0, upper - lower - max + min + 1);
    }
}