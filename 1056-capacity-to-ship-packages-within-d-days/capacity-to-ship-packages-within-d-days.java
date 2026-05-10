class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int idx = 0 , edx = 0, ans = 0;
        for (int i : weights)
        {
            edx += i;
            idx = Math.max(idx,i);
        } 
        while (idx <= edx)
        {
            int mid = (edx + idx) / 2;
            if (isPossible(weights,mid,days))
            {
                ans = mid;
                edx = mid-1;
            } else
            idx = mid + 1;
        }
        return ans;

    }

    boolean isPossible(int[] w, int k, int days) {
        int cap = k, day = 1;
        for (int i : w) {
            if (i > k) {
                day++;
                k = cap;
            }
            k -= i;
        }
        return day <= days;
    }
}