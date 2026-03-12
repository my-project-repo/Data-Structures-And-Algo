class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        func(0,nums,new LinkedList<>(), res);
        return res;
        
    }
    void func (int idx , int [] nums , List<Integer> list , List<List<Integer>> ans)
    {
        if (idx == nums.length)
        {
            ans.add(new LinkedList<>(list));
            return;
        }

        list.add(nums[idx]); 
        func(idx+1,nums,list,ans); // include;
        list.removeLast();
        func(idx+1,nums,list,ans); // exclude
    }
}