class Solution {
    public int[] separateDigits(int[] nums) {
        int size = 0, ans[], curr = -1;
        for (int i : nums)
            size += (int) Math.log10(i) + 1;
        ans = new int[size];
        for (int i : nums) {
            int len = (int) Math.log10(i) + 1;
            curr += len;
            int p = curr;
            while (i > 0) {
                ans[p--] = i % 10;
                i /= 10;
            }
        }

        return ans;
    }
}