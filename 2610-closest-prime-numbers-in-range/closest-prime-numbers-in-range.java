class Solution {
    public int[] closestPrimes(int left, int right) {
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        int[] res = { -1, -1 };
        for (int i = left; i <= right; i++) {
            if (i!=2 && i % 2 == 0)
                continue;
            if (isPrime(i)) {
                list.add(i);
            }
        }
        if (list.size() < 2)
            return res;
        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i - 1);
            if (diff < min) {
                res[0] = list.get(i - 1);
                res[1] = list.get(i);
                min = diff;
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