class Solution {
    public int[][] merge(int[][] intervals) {
          Arrays.sort(intervals, Comparator.comparingInt(arr->arr[0])); // on the basis of first index
        List<int[]> list = new ArrayList<>();
        int [] saver = intervals[0];
        list.add(saver);
        for (int [] interval : intervals)
        {
            if (interval[0]<= saver[1])
            {
                saver[1] = Math.max(interval[1],saver[1]);
            } else {
                saver = interval;
                list.add(saver);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}