class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int diff = 0, same = 0;
        for (int i : nums) {
            if (i < target)
                diff++;
            else if (i == target)
                same++;
        }
        for (int i = 0; i < same; i++) {
            list.add(diff);
            diff++;
        }
        
        return list;
    }
}