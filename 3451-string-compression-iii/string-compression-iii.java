class Solution {
    public String compressedString(String word) {
        int n = word.length();
        StringBuilder res = new StringBuilder();
        int i, count = 1;
        for (i = 1; i < n; i++) {
            char curr = word.charAt(i);
            char prev = word.charAt(i-1);
            if (curr == prev) {
                count++;
                if (count == 9) {
                    res.append("9").append(curr);
                    count = 0;
                }
            } else {
                if (count > 0)
                    res.append(String.valueOf(count)).append(prev);
                count = 1;
            }
        }
        if (count > 0)
            res.append(String.valueOf(count)).append(word.charAt(i-1)); // last
        return res.toString();
    }
}