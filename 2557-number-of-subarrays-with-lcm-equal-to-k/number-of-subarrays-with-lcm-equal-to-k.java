class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int ans = 0;
        for (int i = 0;i<nums.length;i++)
        {
            int l = nums[i];
            if (l == k) ans++;
            for (int j = i+1;j<nums.length;j++)
            {
                l = lcm(l,nums[j]);
                if (l == k) ans++;
                if (l > k) break;
            }
        }
        return ans;
    }
    int lcm (int x , int y)
    {
        int pro = x * y;
        while (y != 0)
        {
            int t = y;
            y = x % y;
            x = t;
        }
        return pro / x;
    }
}