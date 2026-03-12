class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0 , prefix = 0;
        for (int i = 0;i<nums.length;i++)
        {
            prefix += nums[i];
            int need = prefix - k;
            if (map.containsKey(need))
            {
                res += map.get(need);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return res;
    }
}