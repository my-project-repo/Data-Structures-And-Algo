class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int index = 1;
        for (int i = 0; i < target.length; i++) {
            while (target[i] > index) {
                list.add("Push");
                list.add("Pop");
                index++;
            }
            list.add("Push");
            index++;
        }
        return list;
    }
}