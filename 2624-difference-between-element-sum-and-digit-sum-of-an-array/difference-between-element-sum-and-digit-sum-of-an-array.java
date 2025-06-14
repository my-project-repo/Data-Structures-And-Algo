class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0, digitSum = 0;
        for (int i : nums) {
            sum += i;
            digitSum += help(i);
        }
        return Math.abs(sum - digitSum);
    }

    int help(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}