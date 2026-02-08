class Solution {
    public int minOperations(int[] nums) {
        int[] freq = new int[100001];
        int i;
        for (i = nums.length - 1; i >= 0; i--) {
            if (freq[nums[i]] == 1)
                break;
            freq[nums[i]] = 1;
        }
        return (i+3)/3;
    }
}