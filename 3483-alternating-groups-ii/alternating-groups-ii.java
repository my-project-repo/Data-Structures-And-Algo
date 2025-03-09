class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int res = 0, counter = 1, n = colors.length;
        for (int i = 1; i < n + k - 1; i++) {
            if (colors[i % n] != colors[(i - 1) % n])
                counter++;
            else
                counter = 1;
            if (counter >= k)
                res++;
        }
        return res;

    }
}