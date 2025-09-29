class Solution {
    int[][] memo = new int[51][51];

    public int minScoreTriangulation(int[] values) {
        return solve(values, 0, values.length - 1);
    }

    int solve(int[] values, int i, int j) {
        if (j - i + 1 < 3) {
            return 0;
        }
        if (memo[i][j] != 0)
            return memo[i][j];
        int res = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            int val = values[i] * values[k] * values[j]
                    + solve(values, i, k)
                    + solve(values, k, j);

            res = Math.min(res, val);
        }
        return memo[i][j] = res;
    }
}