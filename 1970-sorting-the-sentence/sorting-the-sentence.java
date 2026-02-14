class Solution {
    public String sortSentence(String s) {
      String [] arr = new String [9];
      String [] words = s.split(" ");
      StringBuilder str = new StringBuilder();
      for (String word : words)
      {
        int n = word.length();
        int idx = word.charAt(n-1) - '0';
        arr[idx-1] = word.substring(0,n-1);
      }
      for (String word : arr)
      {
        if (word == null) break;
        str.append(word+" ");
      }
      return str.toString().trim();
       
    }
}