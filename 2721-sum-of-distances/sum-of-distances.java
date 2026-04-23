class Solution {
    public long[] distance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        long[] res = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> l : map.values()) {
            int n = l.size();

            if (n == 1) {
                res[l.get(0)] = 0;
                continue;
            }

            long total = 0;
            for (int idx : l) total += idx;

            long left = 0;

            for (int i = 0; i < n; i++) {
                int idx = l.get(i);

                long right = total - left - idx;

                res[idx] = (long) i * idx - left
                         + right
                         - (long) (n - i - 1) * idx;

                left += idx;
            }
        }

        return res;
    }
}