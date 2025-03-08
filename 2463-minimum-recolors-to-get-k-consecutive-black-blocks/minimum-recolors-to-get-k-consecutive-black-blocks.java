class Solution {
    public int minimumRecolors(String blocks, int k) {
        int WCount = 0, i, j, min;
        for (i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W')
                WCount++;
        }
        j = k;
        i = 1;
        min = WCount;
        while (i < blocks.length() && j < blocks.length()) {
            if (blocks.charAt(i - 1) == 'W')
                WCount--;
            if (blocks.charAt(j) == 'W')
                WCount++;
            min = Math.min(min, WCount);
            i++;
            j++;
        }
        return min;

    }
}