class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<>();
        sum(0, candidates, target, new ArrayList<>(), list);
        return list;
    }

    void sum(int idx, int[] nums, int target, List<Integer> list, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (idx >= nums.length || target < 0)
            return;

        if (nums[idx] > target)
            sum(idx + 1, nums, target, list, res);
        else {

            list.add(nums[idx]); // include;
            sum(idx, nums, target - nums[idx], list, res);
            list.removeLast(); //exclude
            sum(idx + 1, nums, target, list, res);
        }

    }
}