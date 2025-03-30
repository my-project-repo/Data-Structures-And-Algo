class Solution {
    public int maxPower(String s) {
        int counter = 1, max = -99;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                counter++;
            else {
                max = Math.max(max, counter);
                counter = 1;
            }
        }
        max = Math.max(max, counter);
        return max;
    }
}