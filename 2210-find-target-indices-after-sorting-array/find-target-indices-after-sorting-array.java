class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int [] freq = new int[101];
        for (int i : nums) freq[i]++;
        for (int i = 1;i<101;i++)
        {
            if (freq[i] == 0) continue;
            if (i == target)
            {
                while (freq[i]-->0)
                {
                    list.add(count);
                    count++;
                }
            } else
                count += freq[i];
        }
        return list;
    }
}