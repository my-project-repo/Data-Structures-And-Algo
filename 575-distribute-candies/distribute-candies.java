class Solution {
    public int distributeCandies(int[] candyType) {
        int half = candyType.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(set.size(), half);
    }
}