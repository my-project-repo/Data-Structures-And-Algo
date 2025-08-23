class Solution {
    public boolean isBalanced(String num) {
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < num.length(); i++) {
            if ((i + 1) % 2 == 0)
                sumEven += num.charAt(i) - '0';
            else
                sumOdd += num.charAt(i) - '0';
        }
        return sumEven == sumOdd;
    }
}