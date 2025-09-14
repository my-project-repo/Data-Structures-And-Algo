class Solution {
    public int maxFreqSum(String s) {
        int [] freq = new int[26];
        int vowels = 0 , cons = 0;
        for (char ch : s.toCharArray())
        {
            freq[ch - 'a']++;
        }
        for (int i = 0;i<26;i++)
        {
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20)
            vowels = Math.max(vowels,freq[i]);
            else
            cons = Math.max(cons,freq[i]);
        }
        return vowels+cons;
    }
}