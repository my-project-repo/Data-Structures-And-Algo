class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> res = new ArrayList<>();
            if (i == 1) {
                res.add(1);
                res.add(1);
            } else
                res.add(1);
            for (int j = 1; j < i; j++) {
                int val = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                res.add(val);
            }
            if (i > 1)
                res.add(1);
            list.add(res);
        }
        return list;
    }
}