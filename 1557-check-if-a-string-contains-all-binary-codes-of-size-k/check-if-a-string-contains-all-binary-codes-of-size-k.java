class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set <String> set = new HashSet<>();
        int count = 1 << k;
        for (int i = 0;i <= s.length()-k;i++)
        {
            String val = s.substring(i,i+k);
            if (!set.contains(val))
            {
                set.add(val);
                count --;
            }
            if (count == 0) return true;
        }
        return false;

    }
}