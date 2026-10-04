class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> star = new Stack<>();
        int n = s.length(), removed = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                st.push(i);
            else if (ch == '*')
                star.push(i);
            else {
                if (!st.isEmpty() && s.charAt(st.peek()) == '(')
                    st.pop();
                else if (!star.isEmpty())
                    star.pop();
                else
                    return false;

            }
        }

        while (!st.isEmpty() && !star.isEmpty()) {
            if (star.peek() > st.peek()) {
                st.pop();
                star.pop();
            } else
                return false;
        }
        return st.isEmpty();
    }
}