class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int idx = weights[0] , edx = 0 ,ans = 0;
        for (int i : weights)
        {
            idx = Math.max(idx,i);
            edx += i;
        }

        while (idx <= edx)
        {
            int guess = (edx + idx)/2;
            if (isPossible(guess,weights,days))
            {
                ans = guess;
                edx = guess-1;
            } else
            idx = guess + 1;
        }

        return ans;

    }

    boolean isPossible (int guess , int [] W , int k)
    {
        int count = 1 , cost = 0;
        for (int i : W)
        {
            if (cost + i > guess)
            {
                count++;
                cost = 0;
            }

            cost += i;
        }

        return count <= k;
    }
}