class Solution {
    public int[] closestPrimes(int left, int right) {
        Stack<Integer> stack = new Stack<>();
        int min = Integer.MAX_VALUE;
        int[] res = { -1, -1 };
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                if (!stack.isEmpty() && i - stack.peek() < min) {
                    res[0] = stack.peek();
                    res[1] = i;
                    min = i - stack.peek();
                }
                stack.push(i);
            }
        }
        return res;
    }

    boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}