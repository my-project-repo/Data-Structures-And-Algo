class Solution {
    public String addBinary(String a, String b) {
      char [] first = a.toCharArray() , second = b.toCharArray();
        int idx1 = first.length-1 , idx2 = second.length-1, sum = 0 , carry = 0;
        StringBuilder str = new StringBuilder();
        while (idx1 >= 0 && idx2 >=0)
        {
            sum = carry + (first[idx1]-'0') + (second[idx2]-'0');
            carry = sum / 2;
            str.insert(0,(sum % 2 == 0) ? '0' : '1');
            idx1 --; idx2--;
        }
        while (idx1 >= 0)
        {
            sum = carry + (first[idx1] - '0');
            carry = sum / 2;
            str.insert(0,(sum % 2 == 0) ? '0' : '1');
            idx1--;
        }
        while (idx2 >= 0)
        {
            sum = carry + (second[idx2] - '0');
            carry = sum / 2;
            str.insert(0,(sum % 2 == 0) ? '0' : '1');
            idx2--;
        }
        if (carry != 0)
            str.insert(0,'1');
        return str.toString();
    }
}