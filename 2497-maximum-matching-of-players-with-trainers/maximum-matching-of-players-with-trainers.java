class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int idx = 0, idx2 = 0, edx = players.length, edx2 = trainers.length, res = 0;
        while (idx < edx && idx2 < edx2) {
            if (players[idx] <= trainers[idx2]) {
                res++;
                idx++;
            }
            idx2++;
        }
        return res;
    }
}