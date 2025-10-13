class Solution {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        int i = 0, d = s.length(), p = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'D')
                res[p++] = d--;
            else
                res[p++] = i++;
        }
        res[s.length()] = d;
        return res;
    }
}