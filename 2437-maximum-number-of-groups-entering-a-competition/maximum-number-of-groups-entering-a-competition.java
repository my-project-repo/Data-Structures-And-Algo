class Solution {
    public int maximumGroups(int[] grades) {
        int k = 0, total = 0;
        while (total + k + 1 <=  grades.length) {
            total += ++k;
        }
        return k;
    }
}