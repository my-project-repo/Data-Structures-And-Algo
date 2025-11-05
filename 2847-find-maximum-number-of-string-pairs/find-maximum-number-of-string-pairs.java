class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int res = 0;
        Set<String> set = new HashSet<>();
        for (String wrd : words) {
            if (set.contains(reverse(wrd)))
                res++;
            else
                set.add(wrd);
        }
        return res;
    }

    String reverse(String wrd) {
        char[] ch = wrd.toCharArray();
        int idx = 0, edx = ch.length - 1;
        while (idx < edx) {
            char t = ch[idx];
            ch[idx] = ch[edx];
            ch[edx] = t;
            idx++; edx--;
        }
        return new String(ch);
    }
}