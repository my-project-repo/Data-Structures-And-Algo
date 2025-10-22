class Solution {
    public int calPoints(String[] operations) {
        int[] ops = new int[operations.length];
        int ind = -1;
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("+")) {
                ops[++ind] = ops[ind - 1] + ops[ind - 2];
            } else if (op.equals("D")) {
                ops[++ind] = 2 * ops[ind - 1];
            } else if (op.equals("C")) {
                ind--;
            } else {
                ops[++ind] = Integer.parseInt(op);
            }
        }
        int sum = 0;
        for (int i = 0; i <= ind; i++) {
            sum += ops[i];
        }
        return sum;
    }
}