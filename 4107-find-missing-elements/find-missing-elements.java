class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean [] freq = new boolean [101];
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for (int i : nums)
        {
            freq[i] = true;
            min = Math.min(min,i);
            max = Math.max(max,i);
        }

        for (int i = min;i<=max;i++)
        {
            if (!freq[i]) list.add(i);
        }

        return list;
    }
}