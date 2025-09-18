class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listOne = new ArrayList<>();
        List<Integer>listTwo = new ArrayList<>();
        int [] winners = new int[100001];
        int [] losers = new int[100001];
        for (int [] match : matches)
        {
            winners[match[0]]++;
            losers[match[1]]++;
        }
        for (int i = 1;i<100001;i++)
        {
            if (winners[i] > 0 && losers[i]==0)
            listOne.add(i);
            if (losers[i] == 1)
            listTwo.add(i);
        }
        list.add(listOne);
        list.add(listTwo);
        return list;
    }
}