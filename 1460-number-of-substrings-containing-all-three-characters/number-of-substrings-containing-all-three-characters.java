import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numberOfSubstrings(String s) {
        // bruteForce
        int[] hash = { -1, -1, -1 };
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] = i;
            if (hash[0] != -1 && hash[1] != -1 && hash[2] != -1)
                res += 1 + (min(hash[0], hash[1], hash[2]));

        }
        return res;
    }

    int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}