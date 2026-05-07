class Solution {
    public String minWindow(String s, String t) {
        int[] sFreq = new int[58];
        int[] tFreq = new int[58];
        char[] ch = s.toCharArray();
        int n = ch.length, l = 0, min = Integer.MAX_VALUE, st = 0;
        for (char c : t.toCharArray()) {
            tFreq[c - 'A']++;
        }

        for (int r = 0; r < n; r++) {
            sFreq[ch[r] - 'A']++;
            while (isEqual(sFreq, tFreq)) {
                int window = r - l + 1;
                if (window < min) {
                    st = l;
                    min = window;
                }
                sFreq[ch[l] - 'A']--;
                l++;
            }

        }
        System.out.println(min);
        return min == Integer.MAX_VALUE ? "" : s.substring(st,st+min);
    }

    boolean isEqual(int[] f1, int[] f2) {
        for (int i = 0; i < 58; i++) {
            if (f1[i] < f2[i])
                return false;
        }
        return true;
    }
}