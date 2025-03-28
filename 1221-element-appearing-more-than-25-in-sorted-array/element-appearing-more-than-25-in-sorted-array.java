class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = arr.length / 4, idx = arr[0], c = 0;
        for (int i : arr) {
            if (i == idx)
                c++;
            else {
                c = 1;
                idx = i;
            }
            if (c > count)
                return i;
        }
        return idx;
    }
}