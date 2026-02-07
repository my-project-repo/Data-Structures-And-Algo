class Solution {
    int max = 0;

    public int maxLength(List<String> arr) {
        solver(0, arr.size(), arr, "");
        return max;
    }

    void solver(int i, int n, List<String> str, String temp) {
        if (i == n) {
            if (temp.length() > max && !hasDuplicate(temp)) {
                max = temp.length();
            }
            return;
        }
        solver(i + 1, n, str, temp + str.get(i)); // include
        solver(i + 1, n, str, temp); // exclude
    }

    boolean hasDuplicate(String curr) {
        int[] val = new int[26];

        for (char c : curr.toCharArray()) {
            if (val[c - 'a'] > 0)
                return true;
            val[c - 'a']++;
        }
        return false;
    }
}