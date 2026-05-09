class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
         List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (r - l + 1 == 10) {
                String val = s.substring(l, r + 1);
                map.put(val,map.getOrDefault(val,0)+1);
                l++;
            }
        }

        for (String key : map.keySet())
        {
            if (map.get(key) > 1) list.add(key);
        }
        
       

        return list;
    }
}