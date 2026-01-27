class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int count = 0;
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
            count = 1;
            else if (ch == ')')
            {
                str.append(map.getOrDefault(st.toString(),"?"));
                count = 0;
                st.setLength(0);
            }
            else if (count == 1)
            {
                st.append(ch);
            }
            else
            str.append(ch);
            
        }
        return str.toString();
    }
}