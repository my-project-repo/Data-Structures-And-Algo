class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        int max = tasks[0][1], sum = max;
        for (int task[] : tasks) {
            if (sum < task[1]) {
                int r = task[1] - sum;
                max += r;
                sum += r;
            }

            sum -= task[0];
        }
        return max;
    }
}