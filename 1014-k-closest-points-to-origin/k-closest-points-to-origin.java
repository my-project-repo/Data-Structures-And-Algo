class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        if (k > points.length)
            return ans;
        int index = k-1;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double x = Math.sqrt((a[0] * a[0]) + (a[1] * a[1]));
            double y = Math.sqrt((b[0] * b[0]) + (b[1] * b[1]));
            return Double.compare(y, x);
        });

        for (int point[] : points) {
            pq.add(point);
            if (pq.size() > k)
                pq.poll();
        }

        while (!pq.isEmpty())
        {
            int [] point = pq.poll();
            ans[index--] = point;
        }

        return ans;

    }
}