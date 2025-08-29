import java.util.*;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (String str : words) {
            StringTokenizer st = new StringTokenizer(str, separator + "");
            while (st.hasMoreTokens()) {
                res.add(st.nextToken());
            }
        }
        return res;
    }
}