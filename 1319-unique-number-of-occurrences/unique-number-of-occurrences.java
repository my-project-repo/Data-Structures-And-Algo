class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int[] a = new int[2001];
        for (int i : arr) {
            a[i + 1000]++;
        }
        for (int i : a) {
            if (i == 0)
                continue;
            if (!set.contains(i))
                set.add(i);
            else
                return false;
        }
        return true;
    }
}