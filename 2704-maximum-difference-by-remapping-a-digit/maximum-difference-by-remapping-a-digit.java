class Solution {
    public int minMaxDifference(int num) {
        String arr = Integer.toString(num);
        char zero = arr.charAt(0), nine = ' ';
        String digitOne = "", digitTwo = "";
        for (char ch : arr.toCharArray()) {
            if ((ch - '0') != 9) {
                nine = ch;
                break;
            }
        }
        for (char ch : arr.toCharArray()) {
            digitOne += (ch == zero) ? "0" : ch;
            digitTwo += (ch == nine) ? "9" : ch;
        }
        return Integer.parseInt(digitTwo) - Integer.parseInt(digitOne);
    }
}