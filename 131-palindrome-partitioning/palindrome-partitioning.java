class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        backtrack(s,list,ans);
        return ans;

    }

    void backtrack(String s, List<String> list, List<List<String>> res) {
        if (s.length() == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String prev = s.substring(0, i + 1);
            if (isPal(prev)) {
                list.add(prev);
                backtrack(s.substring(i + 1), list, res);
                list.removeLast();
            }
        }
    }

    boolean isPal(String str) {
        if (str.length() == 1)
            return true;
        int idx = 0, edx = str.length() - 1;
        while (idx < edx) {
            if (str.charAt(idx++) != str.charAt(edx--))
                return false;
        }
        return true;
    }
}