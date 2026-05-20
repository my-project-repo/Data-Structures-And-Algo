class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int N = A.length, p = 0, count = 0;
        int[] freq = new int[N + 1];
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            if (freq[A[i]] >= 1)
                count++;
            if (freq[B[i]] >= 1)
                count++;
            if (A[i] == B[i])
                count++;
            freq[A[i]]++;
            freq[B[i]]++;
            res[p++] = count;
        }

        return res;
    }
}