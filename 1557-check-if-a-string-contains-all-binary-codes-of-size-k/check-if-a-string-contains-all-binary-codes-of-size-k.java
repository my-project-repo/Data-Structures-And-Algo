class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        int count = 1 << k;
        for (int i = 0; i <= s.length() - k; i++) {
            String val = s.substring(i, i + k);
            if (!set.contains(val)) {
                set.add(val);
                if (set.size() == count)
                    return true;
            }
        }
        return false;

    }
}