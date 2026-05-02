class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == ',')
                continue;
            else if (ch == ')') {
                List<Character> list = new ArrayList<>();
                while (!st.isEmpty() && st.peek() != '(') {
                    list.add(st.pop());
                }
                st.pop();
                char exp = st.pop();
                st.push(expressionSolver(list, exp));
            } else
                st.push(ch);
        }

        return st.peek() == 't' ? true : false;
    }

    char expressionSolver(List<Character> list, char exp) {
        if (exp == '!')
            return list.get(0) == 't' ? 'f' : 't';
        else if (exp == '&') {
            for (char ch : list) {
                if (ch == 'f')
                    return 'f';
            }
            return 't';
        } else {
            for (char ch : list) {
                if (ch == 't')
                    return 't';
            }
            return 'f';
        }
    }

}