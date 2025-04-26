import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        adder(map);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i < s.length() - 1) {
                char next = s.charAt(i + 1);
                if (ch == 'I' && (next == 'V' || next == 'X')) {
                    res += map.get(next) - 1;
                    i++;
                    continue;
                } else if (ch == 'X' && (next == 'L' || next == 'C')) {
                    res += map.get(next) - 10;
                    i++;
                    continue;
                } else if (ch == 'C' && (next == 'D' || next == 'M')) {
                    res += map.get(next) - 100;
                    i++;
                    continue;
                }
            }
            res += map.get(ch);
        }
        return res;
    }

    private void adder(Map<Character, Integer> map) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
}