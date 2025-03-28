class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (prefix[i] == k)
                res++;
            if (map.containsKey(prefix[i] - k))
                res += map.get(prefix[i] - k);
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }
        return res;
    }
}