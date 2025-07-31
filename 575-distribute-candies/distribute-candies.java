class Solution {
    public int distributeCandies(int[] candyType) {
        int[] arr = new int[200002];
        int count = 0;
        for (int i : candyType) {
            if (++arr[i + 100000] == 1)
                count++;
        }
        int n = candyType.length;
        return Math.min(n / 2, count);
    }
}