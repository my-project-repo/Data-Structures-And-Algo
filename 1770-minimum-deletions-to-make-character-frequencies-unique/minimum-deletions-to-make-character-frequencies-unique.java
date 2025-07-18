class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i : freq) {
            if (i == 0)
                continue;
            if (!set.contains(i))
                set.add(i);
            else {
                while (set.contains(i)) {
                    count++;
                    i--;
                }
                if (i > 0) set.add(i);
            }
        }
        return count;
    }
}