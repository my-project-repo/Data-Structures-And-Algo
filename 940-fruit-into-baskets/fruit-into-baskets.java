class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, ans = 0, n = fruits.length, size = 0;
        int[] freq = new int[n + 1];
        for (int r = 0; r < n; r++) {
            if (freq[fruits[r]] == 0)
                size++;
            freq[fruits[r]]++;
            while (l <= r && size > 2) {
                freq[fruits[l]]--;
                if (freq[fruits[l]] == 0)
                    size--;
                l++;
            }
                ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}