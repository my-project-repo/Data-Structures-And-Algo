class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String str : operations) {
            if (str.charAt(0) == '-' || str.charAt(str.length() - 1) == '-')
                x--;
            else
                x++;
        }
        return x;

    }
}