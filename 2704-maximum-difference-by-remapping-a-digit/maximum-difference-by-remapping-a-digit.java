class Solution {
    public int minMaxDifference(int num) {
        String arr = Integer.toString(num);
        char zero = arr.charAt(0), nine = ' ';
        StringBuilder digitOne = new StringBuilder();
        StringBuilder digitTwo = new StringBuilder();
        for (char ch : arr.toCharArray()) {
            if ((ch - '0') != 9) {
                nine = ch;
                break;
            }
        }
        for (char ch : arr.toCharArray()) {
            digitOne.append((ch == zero) ? "0" : ch);
            digitTwo.append((ch == nine) ? "9" : ch);
        }
        return Integer.parseInt(digitTwo.toString()) - Integer.parseInt(digitOne.toString());
    }
}