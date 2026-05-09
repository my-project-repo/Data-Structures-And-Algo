class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) return new ArrayList<String>();
        Set<String> set = new HashSet<>();
        Set<String> seen = new HashSet<>();
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (r - l + 1 == 10) {
                String val = s.substring(l, r + 1);
                if (set.contains(val)){
                    seen.add(val);
                }
                else
                    set.add(val);

                l++;
            }
        }
        
        List<String> list = new ArrayList<>(seen);

        return list;
    }
}