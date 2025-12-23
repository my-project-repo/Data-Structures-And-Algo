class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for (int i : nums)
            freq[i]++;
        while (true) {
            List<Integer> list = new ArrayList<>();
            int flag = 0;
            for (int i = 1; i < freq.length; i++) {
                if (freq[i] == 0)
                    continue;
                list.add(i);
                freq[i]--;
                if (freq[i] != 0)
                    flag = -1;
            }
            res.add(list);
            if (flag == 0)
                break;
        }
        return res;
    }
}