class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length];
        int[] res = new int[2];
        int k = 0;
        for (int i : nums) {
            if (freq[i] == 1)
                res[k++] = i;
            freq[i]++;
        }
        return res;
    }
}