class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty() && (ch == ')' || ch == '}' || ch == ']'))
                return false;
            if ((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}')
                    || (stack.peek() == '[' && ch == ']')) {
                stack.pop();
                continue;
            }
            if ((stack.peek() == '(' && ch != ')') || (stack.peek() == '{' && ch != '}')
                    || (stack.peek() == '[' && ch != ']'))
                return false;
        }
        return stack.isEmpty();

    }
}