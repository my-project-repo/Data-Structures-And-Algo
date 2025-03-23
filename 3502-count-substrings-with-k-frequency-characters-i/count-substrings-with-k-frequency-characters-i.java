class Solution {
    public int numberOfSubstrings(String s, int k) {
        int counter = 0, n = s.length();
        for (int i = 0; i < n; i++) {
            int[] res = new int[26];
            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                res[idx]++;
                if (res[idx] >= k) {
                    counter += n - j;
                    break;
                }
            }
        }
        return counter;
    }
}