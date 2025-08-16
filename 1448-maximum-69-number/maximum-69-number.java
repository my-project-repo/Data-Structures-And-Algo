class Solution {
    public int maximum69Number(int num) {
        char[] res = new char[(int) Math.log10(num) + 1];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = (char) (num % 10 + '0');
            num /= 10;
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] != '9') {
                res[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(res));
    }
}