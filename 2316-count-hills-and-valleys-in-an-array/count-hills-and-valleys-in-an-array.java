class Solution {
    public int countHillValley(int[] nums) {
        int size = 0, res = 0, p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1])
                continue;
            size++;
        }
        int[] deductedArr = new int[size];
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1])
                continue;
            deductedArr[p++] = nums[i];
        }
        for (int i = 2; i < size; i++) {
            int first = deductedArr[i - 2];
            int second = deductedArr[i - 1];
            int third = deductedArr[i];
            if (second > first && second > third)
                res++;
            else if (second < first && second < third)
                res++;
        }
        return res;
    }
}