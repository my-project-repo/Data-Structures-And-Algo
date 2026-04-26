class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i : nums)
        {
            int elem = i;
            while (!st.isEmpty())
            {
                int val = gcd(st.peek(),elem);
                if (val == 1) break;
                elem *= st.pop() / val;
            }
            st.push(elem);
        }
        for (int i : st) list.add(i);
        return list;
    }
    int gcd (int a , int b)
    {
        while (b > 0)
        {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}