class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < list.size(); j++) {
                temp.add(list.get(j) + list.get(j - 1));
            }
            temp.add(1);
            list = temp;
        }
        return list;
    }
}