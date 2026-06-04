class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        long time = 0;
        for (int[] course : courses) {
            time += course[0];
            heap.add(course[0]);
            if (time > course[1]) {
                time -= heap.poll();
            }

        }

        return heap.size();
    }
}