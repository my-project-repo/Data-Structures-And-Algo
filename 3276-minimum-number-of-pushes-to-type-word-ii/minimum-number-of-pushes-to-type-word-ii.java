class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        int res = 0, c = 1, p = 1;
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        System.out.println(Arrays.toString(freq));
        for (int i = 25; i >= 0; i--) {
            int val = freq[i];
            if (val == 0) break;
            res += (val * p);
            if (c % 8 == 0)
                p++;
            c++;
        }
        return res;
    }
}