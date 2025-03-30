class Solution {
    public List<Integer> partitionLabels(String s) {
        int max = s.lastIndexOf(s.charAt(0)),start = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<s.length();i++)
        {
            max = Math.max(max,s.lastIndexOf(s.charAt(i)));
            if (i==max){
            list.add(i - start + 1);
            start = max + 1;
            }
        }
        return list;
    }
}