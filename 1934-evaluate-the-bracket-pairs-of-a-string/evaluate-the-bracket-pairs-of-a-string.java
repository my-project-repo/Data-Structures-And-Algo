class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        boolean flag = false;
        StringBuilder str = new StringBuilder();
        StringBuilder st = new StringBuilder();
        Map<String,String> map = new HashMap<>();
        for (List<String> list : knowledge)
        {
            map.put(list.get(0),list.get(1));
        }
        for (char ch : s.toCharArray())
        {
            if (ch == '(')
            flag = true;
            else if (ch == ')')
            {
                str.append(map.getOrDefault(st.toString(),"?"));
                flag = false;
                st.setLength(0);
            }
            else if (flag)
            {
                st.append(ch);
            }
            else
            str.append(ch);
            
        }
        return str.toString();
    }
}