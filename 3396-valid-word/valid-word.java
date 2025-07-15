class Solution {
    public boolean isValid(String word) {
       if (word.length() <= 2) return false;
        int vowel = 0 , cons = 0;
        for (char ch : word.toCharArray()) {
            if (!Character.isLetter(ch) && !Character.isDigit(ch))
                return false;
            if (Character.isLetter(ch)){
                char xd = Character.toUpperCase(ch);
                if (xd == 'A' || xd == 'E' || xd == 'I' || xd == 'O' || xd == 'U')
                    vowel++;
                else
                    cons++;
            }
        }
        return vowel >= 1 && cons >=1;
    }
}