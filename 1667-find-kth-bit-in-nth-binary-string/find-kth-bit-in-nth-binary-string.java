class Solution {
    public char findKthBit(int n, int k) {
        if (n <= 4)
            return "011100110110001".charAt(k-1);
        // dp 110 -> 
        String[] generate = new String[n + 1];
        generate[4] = "011100110110001";
        for (int i = 5; i <= n; i++) {
            generate[i] = generate[i - 1] + "1" + reverse(generate[i - 1]);
        }
        return generate[n].charAt(k-1);
    }

    String reverse(String co) {
        char[] ch = co.toCharArray();
        int idx = 0, edx = ch.length - 1;
        while (idx <= edx) {
            char c = ch[idx] == '1' ? '0' : '1';
            ch[idx] = ch[edx] == '1' ? '0' : '1';
            ch[edx] = c;
            idx++;
            edx--;
        }
        return new String(ch);
    }

}