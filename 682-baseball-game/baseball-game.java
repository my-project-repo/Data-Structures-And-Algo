class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int res = 0;
        for (String s : operations) {
            if (s.equals("+")) {
                int sum = list.getLast() + list.get(list.size() - 2);
                list.add(sum);

            } else if (s.equals("D")) {
                list.add(list.getLast() * 2);

            } else if (s.equals("C")) {
                list.removeLast();

            } else
                list.add(Integer.parseInt(s));
        }
        for (int i : list)
            res += i;
        return res;
    }
}