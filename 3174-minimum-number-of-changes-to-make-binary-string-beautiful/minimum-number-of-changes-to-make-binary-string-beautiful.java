class Solution {
    public int minChanges(String s) {
        int zero = 0, one = 0 , ans = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                if (one % 2 == 0)
                    zero++;
                else
                    ans++;
                one = 0;
            } else {
                if (zero % 2 == 0)
                    one++;
                else
                    ans++;
                zero = 0;
            }
        }
        return ans;
    }
}