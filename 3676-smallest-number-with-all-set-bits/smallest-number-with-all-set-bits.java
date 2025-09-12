class Solution {
    public int smallestNumber(int n) {
        int two = 2;
        while (two <= n) {
            two *= 2;
        }
        return two - 1;
    }
}