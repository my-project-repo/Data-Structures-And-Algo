class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums)
        {
            int elem = i;
            while (!list.isEmpty())
            {
                int val = gcd(list.getLast(),elem);
                if (val == 1) break;
                elem *= list.getLast() / val;
                list.removeLast();
            }
            list.add(elem);
        }
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