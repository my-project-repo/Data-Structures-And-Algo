class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if ((res[index[i]] != 0) || res[index[i]] == 0 && nums[i] == 0)
                shift(res, index[i]);
            res[index[i]] = nums[i];
        }
        return res;
    }

    private void shift(int[] res, int index) {
        for (int i = res.length - 1; i >= index + 1; i--) {
            int temp = res[i - 1];
            res[i - 1] = res[i];
            res[i] = temp;
        }
    }
}