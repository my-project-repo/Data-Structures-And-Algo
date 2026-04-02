class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int [] line = new int[52];
        for (int [] r : ranges)
        {
            line[r[0]]++;
            line[r[1]+1]--;
        }
        for (int i = 1;i<52;i++)
        {
            line[i] += line[i-1];
        }
        for (int i = left;i<=right;i++)
        {
            if (line[i] == 0) return false;
        }
        return true;
    }
}