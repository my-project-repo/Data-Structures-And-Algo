class Solution {
    public int maximumGap(String skill, String station) {
        int m = skill.length(), n = station.length(), pos = 0, ans = 0;
        int[][] freq = new int[m][2]; // start - end
        for (int i = 0; i < n && pos < m; i++) {
            if (skill.charAt(pos) == station.charAt(i)) {
                freq[pos++][0] = i;
            }
        }
        pos = m - 1;
        for (int i = n - 1; i >= 0 && pos >= 0; i--) {
            if (skill.charAt(pos) == station.charAt(i)) {
                freq[pos--][1] = i;
            }
        }

        for (int i = 1; i < m; i++) {
            ans = Math.max(ans, freq[i][1] - freq[i - 1][0]);
        }

        return ans;

    }
}