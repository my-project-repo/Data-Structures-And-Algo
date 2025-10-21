class Solution {
    public int findComplement(int num) {
        int k = 0, res = 0;
        String val = bin(num);
        for (int i = val.length() - 1; i >= 0; i--) {
            if (val.charAt(i) == '0')
                res += (int) Math.pow(2, k);
            k++;
        }
        return res;
    }

    String bin(int num) {
        StringBuilder str = new StringBuilder();
        while (num > 0) {
            str.insert(0, (char) (num % 2 + '0'));
            num /= 2;
        }
        return str.toString();
    }
}