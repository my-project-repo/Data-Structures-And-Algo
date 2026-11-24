class Solution {
    public boolean checkString(String s) {
        // abbabaabab 
        int aCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                aCount++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                aCount--;
            else {
                return aCount == 0;
            }
        }

        return true;
    }
}