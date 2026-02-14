class Solution {
    public String sortSentence(String s) {
        String [] words = s.split(" ");
        StringBuilder str = new StringBuilder();
        Arrays.sort(words,(a,b)->{
            int first = a.charAt(a.length()-1) - '0';
            int second = b.charAt(b.length()-1) - '0';
            return first - second;
        });

        for (String word : words)
        {
            str.append(word.substring(0,word.length()-1)+" ");
        }

        return str.toString().trim();
       
    }
}