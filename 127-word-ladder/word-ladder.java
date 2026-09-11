class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>(wordList);
        Set<String> seen = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        if (!set.contains(endWord)) {
            return 0;
        }

        q.add(beginWord);
        seen.add(beginWord);

        int ans = 1;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                char[] arr = q.poll().toCharArray();

                for (int j = 0; j < arr.length; j++) {

                    char og = arr[j];

                    for (char c = 'a'; c <= 'z'; c++) {

                        arr[j] = c;

                        String w = new String(arr);

                        if (w.equals(endWord)) {
                            return ans + 1;
                        }

                        if (set.contains(w) && !seen.contains(w)) {
                            q.add(w);
                            seen.add(w);
                        }
                    }

                    arr[j] = og;
                }
            }

            ans++;
        }

        return 0;
    }
}