class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
        int min = 9999;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 1;i<nums.length;i++)
        {
            min = Math.min(min,nums[i] - nums[i-1]);
        }
        for (int i = 1;i<nums.length;i++)
        {
            if (nums[i] - nums[i-1] == min)
            {
                list.add(Arrays.asList(nums[i-1] , nums[i]));
            }
        }
        return list;

    }
}