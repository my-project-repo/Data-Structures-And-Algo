class Solution {
    public int distributeCandies(int[] candyType) {
        int candies = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            if (!set.contains(i)) {
                candies++;
            }
            set.add(i);
        }
        return Math.min(candies, candyType.length / 2);
    }
}