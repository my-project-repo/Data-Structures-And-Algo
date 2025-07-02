class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] res = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }
        for (int val : deck) {
            int index = queue.poll();
            res[index] = val;
            if (!queue.isEmpty())
                queue.add(queue.poll());
        }
        return res;
    }
}