class Solution {
    public List<Integer> partitionLabels(String s) {
         int[] lastOccurrence = new int[26];
        for (int i = 0;i<s.length();i++)
        {
            lastOccurrence[s.charAt(i)-'a'] = i;
        }
        int max = s.lastIndexOf(s.charAt(0)), start = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, lastOccurrence[s.charAt(i)-'a']);
            if (i == max) {
                list.add(i - start + 1);
                start = max + 1;
            }
        }
        return list;
    }
}