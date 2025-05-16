class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> list = new ArrayList<>();
        int n = groups.length;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && groups[i] == groups[i + 1])
                continue;
            list.add(words[i]);
        }
        return list;
    }
}