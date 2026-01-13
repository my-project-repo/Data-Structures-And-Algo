class Solution {
    public String capitalizeTitle(String title) {
       StringBuilder str = new StringBuilder();
        String [] words = title.split(" ");
        for (String word : words)
        {
            word = word.toLowerCase();
            if (word.length() <= 2)
            {
                str.append(word).append(" ");
            }
            else
            {
                char ch = Character.toUpperCase(word.charAt(0));
                str.append(ch).append(word.substring(1)).append(" ");
            }
        }
        return str.toString().trim();
    }
}