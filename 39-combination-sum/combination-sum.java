class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solver(0, candidates, target, new ArrayList<>(), res);
        return res;

    }

    void solver(int idx, int[] arr, int target, List<Integer> list, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (idx >= arr.length)
            return;
        if (arr[idx] > target)
            solver(idx + 1, arr, target, list, res);
        else {

            list.add(arr[idx]);
            solver(idx, arr, target - arr[idx], list, res);
            list.remove(list.size() - 1);
            solver(idx + 1, arr, target, list, res);
        }
    }
}