class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new ArrayList<>();
        for (String word : queries) {
            for (String d : dictionary) {
                int c = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) != d.charAt(i))
                        c++;
                }
                if (c <= 2) {
                    res.add(word);
                    break;
                }
            }
        }
        return res;
    }
}