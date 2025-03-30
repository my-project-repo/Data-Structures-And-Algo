class Solution {
    public int maxPower(String s) {
        int max = 0;
        int temp = 1;
        char[] array = s.toCharArray();
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] != array[i]) {
                max = Math.max(temp, max);
                temp = 1;
            } else {
                temp++;
            }
        }

        return Math.max(max, temp);
    }
}