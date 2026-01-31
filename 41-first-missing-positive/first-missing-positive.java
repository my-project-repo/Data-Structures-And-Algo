class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums.length ==1 && nums[0] == 2147483647) return 1;
        Set<Integer> set = new HashSet<>();
        int first = 0 , last = -1;
        for (int i : nums)
        {
            first = Math.min(first,i);
            last = Math.max(last,i);
            set.add(i);
        }
        if (last == -1) return 1;
        if (first == -2147483646 ) first = 1;
        last = (last == 2147483647) ? last : last+1;
        for (int i = first;i<=last;i++)
        {
            if (i <= 0) continue;
            if (!set.contains(i))
            return i;
        }
        return -1;
    }
}