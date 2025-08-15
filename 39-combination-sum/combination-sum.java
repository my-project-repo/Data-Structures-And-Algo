class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solver(0, candidates, 0, new ArrayList<>(), res, target);
        return res;

    }

    void solver(int idx, int[] arr, int sum, List<Integer> list, List<List<Integer>> res, int target) {
        if (sum > target || idx >= arr.length) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[idx]);
        solver(idx, arr, sum + arr[idx], list, res, target);
        list.remove(list.size() - 1);
        solver(idx + 1,arr, sum, list, res, target);
    }
}