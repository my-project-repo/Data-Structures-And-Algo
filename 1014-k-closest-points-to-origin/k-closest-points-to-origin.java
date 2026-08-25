class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        if (k > points.length)
            return ans;
        int index = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            int x = (a[0] * a[0]) + (a[1] * a[1]);
            int y = (b[0] * b[0]) + (b[1] * b[1]);
            return Integer.compare(x, y);
        });

        for (int[] point : points)
            pq.add(point);
        for (int i = 0; i < k; i++) {
            int[] point = pq.poll();
            ans[index++] = point;

        }

        return ans;

    }
}