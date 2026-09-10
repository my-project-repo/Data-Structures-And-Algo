class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {

            char digit = num.charAt(i);

            while (k > 0 &&
                    str.length() > 0 &&
                    str.charAt(str.length() - 1) > digit) {

                str.deleteCharAt(str.length() - 1);
                k--;
            }

            str.append(digit);
        }

        while (k > 0) {
            str.deleteCharAt(str.length() - 1);
            k--;
        }

        int i = 0;

        while (i < str.length() && str.charAt(i) == '0')
            i++;

        if (i == str.length())
            return "0";

        return str.substring(i);
    }
}