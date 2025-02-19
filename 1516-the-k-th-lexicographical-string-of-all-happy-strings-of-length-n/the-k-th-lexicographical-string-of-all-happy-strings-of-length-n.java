import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getHappyString(int n, int k) {
        List<String> res = new ArrayList<>();
        backtracker(n, "", res, new char[] { 'a', 'b', 'c' });
        return (k > res.size()) ? "" : res.get(k - 1);
    }

    public void backtracker(int n, String word, List<String> res, char[] arr) {
        // base case
        if (word.length() == n) {
            res.add(word);
        } else {
            for (char ch : arr) {
                if (word.isEmpty() || word.charAt(word.length() - 1) != ch) {
                    backtracker(n, word + ch, res, arr);
                }
            }
        }
    }
}