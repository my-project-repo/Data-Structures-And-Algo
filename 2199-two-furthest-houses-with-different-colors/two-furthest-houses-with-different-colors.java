class Solution {
    public int maxDistance(int[] colors) {
        int max = 0 , n = colors.length;
        for (int i = 0 ;i<n;i++)
        {
            if (colors[0] != colors[i])
            max = Math.max(max,i);

            if (colors[i] != colors[n-1])
            max = Math.max(max,n-i-1);
        }
        return max;
    }
}