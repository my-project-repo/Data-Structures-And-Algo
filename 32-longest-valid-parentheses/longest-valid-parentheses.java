class Solution {
    public int longestValidParentheses(String s) {
        if (s.isEmpty())
        return 0;
      Stack<Integer> stack = new Stack<>();
        int counter = 0;
        stack.push(-1);
        for (int i =0;i<s.length();i++)
        {
            if (s.charAt(i) == '(')
                stack.push(i);
            else if (s.charAt(i)==')')
            {
                stack.pop();
                if (stack.isEmpty())
                {
                    stack.push(i);
                }
                else
                {
                    counter = Math.max(counter,i-stack.peek());
                }
            }
        }
        return counter;

    }
}