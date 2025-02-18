class Solution {
    public String smallestNumber(String pattern) {
        // Using StringBuilders
        StringBuilder another = new StringBuilder();
        StringBuilder res = new StringBuilder();
        pattern = pattern + "I";
        for (int i = 0; i < pattern.length(); i++) {
            res.append(i + 1);
            if (pattern.charAt(i) == 'I') {
                res.reverse();
                another.append(res);
                res.setLength(0);
            }
        }
        return another.toString();

    }
}