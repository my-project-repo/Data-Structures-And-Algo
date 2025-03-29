class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int res = 0;
        for (int a : batteryPercentages)
            res += a > res ? 1 : 0;
        return res;
    }
}