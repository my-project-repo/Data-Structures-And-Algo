class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < variables.length; i++) {
            long first = expo(variables[i][0], variables[i][1], 10);
            long second = expo((int) first, variables[i][2], variables[i][3]);
            if (second == target) {
                list.add(i);
            }
        }
        return list;
    }

    long expo(int base, int exponent, int mod) {
        long res = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1)
                res = (res * base) % mod;
            base = (base * base) % mod;
            exponent /= 2;
        }
        return res;
    }
}