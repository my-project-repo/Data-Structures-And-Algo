class Solution {
    public int maxDistance(int[] P, int m) {
        Arrays.sort(P);
        int idx = 1, edx = P[P.length - 1] - P[0], ans = 0;
        while (idx <= edx) {
            int mid = (edx + idx) / 2;
            if (isPossible(P, mid, m)) {
                ans = mid;
                idx = mid + 1;
            } else
                edx = mid - 1;
        }

        return ans;
    }

    boolean isPossible (int [] P , int k , int balls)
    {
        int ball = 1 , curr = 0;
        for (int i = 1;i<P.length;i++)
        {
            if (P[i] - P[curr] >= k){
                 ball++;
                 curr = i;
            }
           
        }

        return ball >= balls;
    }
}