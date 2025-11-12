class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd = 0, res = 0, l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 != 0){
                k--;
                odd = 0;
            }
            while (k == 0) {
                odd++;
                if (nums[l] % 2 != 0)
                    k++;
                l++;
            }
            res += odd;
        }
        return res;
    }
}