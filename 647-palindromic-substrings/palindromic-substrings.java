class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int odd = expand(ch, i, i);
            int even = expand(ch, i, i + 1);
            res += odd + even;
        }
        return res;

    }

    int expand(char[] ch, int left, int right) {
        int count = 0;
        while (left >= 0 && right < ch.length && ch[left] == ch[right]) {
            left--;
            right++;
            count++;
        }
        return count;
    }
}