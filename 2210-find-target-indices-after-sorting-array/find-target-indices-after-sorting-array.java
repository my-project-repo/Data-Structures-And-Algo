class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int same = 0 , diff = 0;
        for (int i : nums)
        {
            if (i < target)
            diff++;
            if (i == target) same++;
        }
        while (same --> 0)
        {
            list.add(diff);
            diff++;
        }

        return list;
    }
}