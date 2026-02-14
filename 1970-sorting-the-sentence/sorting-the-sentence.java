class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res =new String[words.length];
        for (String w : words) 
            res[w.charAt(w.length() - 1) - '1'] = w.substring(0, w.length() - 1);
        return String.join(" ", res);
    }
}