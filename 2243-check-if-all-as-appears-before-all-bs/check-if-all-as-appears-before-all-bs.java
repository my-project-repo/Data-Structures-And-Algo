class Solution {
    public boolean checkString(String s) {
        // abbabaabab 
        boolean flag = false;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'b') {
                flag = true;
            } else {
                if (flag)
                    return false;
            }
        }

        return true;
    }
}