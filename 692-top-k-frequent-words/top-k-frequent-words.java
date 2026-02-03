class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> 
        {
            if (a.freq != b.freq) {
                return a.freq - b.freq;
            } else {
                return b.word.compareTo(a.word);
            }

        });
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String key : map.keySet()) {
            q.add(new Pair(key, map.get(key)));
            if (q.size()>k) q.poll();
        }
        while (k-- > 0) {
            list.addFirst(q.poll().word);
        }
        return list;
    }
}
 class Pair
    {
        String word;
        int freq;
        Pair (String word, int freq)
        {
            this.word = word;
            this.freq = freq;
        }
    }