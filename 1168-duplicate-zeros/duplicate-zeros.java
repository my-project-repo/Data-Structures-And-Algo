class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list = new LinkedList<>();
        int n = arr.length, c = 0;
        for (int i : arr) {
            list.add(i);
            c++;
            if (i == 0) {
                list.add(0);
                c++;
            }
            if (c == n)
                break;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
    }
}