class Solution {
    public int numRabbits(int[] answers) {
        int[] freq = new int[1000];
        int ans = 0;
        for (int i : answers) {
            if (++freq[i] == 1)
                ans += i + 1;
            if (freq[i] == i + 1)
                freq[i] = 0;
        }
        return ans;
    }
}