class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE, idx = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int var = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (var == min)
                    continue;
                else if (min > var) {
                    min = var;
                    idx = i;
                }
            }

        }
        return idx;
    }
}