class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        int res = 0, l = 0;
        for (int i = 0; i < 3; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }
        if (map.size() == 3)
            res++;
        for (int i = 3; i < ch.length; i++) {
            if (map.get(ch[l]) == 1)
                map.remove(ch[l]);
            else
                map.put(ch[l], map.get(ch[l]) - 1);

            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
            if (map.size() == 3)
                res++;
            l++;
        }
        return res;
    }
}