class Solution {
    public int numberOfBeams(String[] bank) {
        int div = 0, prev = 0, res = 0;
        for (String ind : bank) {
            div = 0;
            for (char ch : ind.toCharArray()) {
                if (ch == '1')
                    div++;
            }
            if (div != 0) {
                res += div * prev;
                prev = div;
            }
        }
        return res;
    }
}