class Solution {
    public int maxPalindromes(String s, int k) {
        int i = 0, n = s.length(), ans = 0, end = -1;
        while (i < n) {
            int f = expand(i, i, k,end, s); // odd window
            int f2 = expand(i, i + 1, k,end, s); // even window
            if (f != -1) {
                i = f+1;
                end = f;
                ans++;
            } else if (f2 != -1) {
                i = f2+1;
                end = f2;
                ans++;
            } else
                i++;

        }
        return ans;
    }

    int expand(int left, int right, int k, int end, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if ((right - left + 1) >= k && left > end)
                return right;
            left--;
            right++;
        }

        return -1;
    }
}