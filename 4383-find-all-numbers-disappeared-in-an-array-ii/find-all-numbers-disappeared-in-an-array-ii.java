class Solution {
        public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
            List<List<Integer>> list = new ArrayList<>();
            Set<Integer> set = new HashSet<>();

            for (int num : nums) {
                set.add(num);
            }

            for (int i = lower; i <= upper; i++) {
                if (set.contains(i)) {
                    if (lower < i) {
                        list.add(List.of(lower, i - 1));
                    }
                    lower = i + 1;
                }
            }

            if (lower <= upper) {
                list.add(List.of(lower, upper));
            }

            return list;
        }
}