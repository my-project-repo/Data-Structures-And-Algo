class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            while (k > 0 && !st.isEmpty() && st.peek() > digit) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while (k-- > 0)
            st.pop();

        while (!st.isEmpty()) {
            str.insert(0, st.pop());
        }

        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }

        if (i == str.length())
            return "0";

        return str.substring(i);
    }
}