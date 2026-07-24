class Solution {
    public int strStr(String haystack, String needle) {
        int k = needle.length() , l = 0;
        for (int r = 0;r<haystack.length();r++)
        {
            if (r - l + 1 == k)
            {
                String window = haystack.substring(l,r+1);
                if (window.equals(needle)) return l;
                l++;
            }
        }

        return -1;
    }
}