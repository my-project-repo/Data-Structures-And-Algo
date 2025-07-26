class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        solver(list, new ArrayList<>(), 0, nums);
        return list;
    }

    void solver(List<List<Integer>> list, List<Integer> res, int idx, int[] arr) {
        if (idx == arr.length) {
            list.add(new ArrayList<>(res));
            return;
        }
        res.add(arr[idx]);
        solver(list, res, idx + 1, arr); // include
        res.removeLast();
        solver(list, res, idx + 1, arr); // exclude
    }
}