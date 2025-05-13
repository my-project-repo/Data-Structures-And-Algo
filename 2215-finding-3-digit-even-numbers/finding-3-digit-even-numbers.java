class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] res = new int[451];
        int pos = 0;
        int[] freq = new int[10];
        for (int i : digits) // frequency of digits
            freq[i]++;

        for (int i = 1; i <= 9; i++) {
            if (freq[i] == 0)
                continue;
            freq[i]--;
            for (int j = 0; j <= 9; j++) {
                if (freq[j] == 0)
                    continue;
                freq[j]--;
                for (int k = 0; k <= 8; k += 2) {
                    if (freq[k] == 0)
                        continue;
                    freq[k]--;
                    int digit = i * 100 + j * 10 + k;
                    res[pos++] = digit;
                    freq[k]++;
                }
                freq[j]++;
            }
            freq[i]++;

        }
        return Arrays.copyOf(res, pos);
    }
}