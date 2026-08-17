class Solution {
    public int maximumGap(String skill, String station) {
        int m = skill.length(), n = station.length(), pos = 0, ans = 0;
        int [] left = new int[m];
        int [] right = new int[m];
        for (int i = 0; i < n && pos < m; i++) {
            if (skill.charAt(pos) == station.charAt(i)) {
                left[pos++] = i;
            }
        }
        pos = m - 1;
        for (int i = n - 1; i >= 0 && pos >= 0; i--) {
            if (skill.charAt(pos) == station.charAt(i)) {
                right[pos--] = i;
            }
        }

        for (int i = 1; i < m; i++) {
            ans = Math.max(ans, right[i] - left[i-1]);
        }

        return ans;

    }
}