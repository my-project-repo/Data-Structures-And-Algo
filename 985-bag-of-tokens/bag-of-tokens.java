class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0, idx = 0, edx = tokens.length - 1, maxScore = 0;
        while (idx <= edx) {
            if (power >= tokens[idx]) {
                score++;
                power -= tokens[idx];
                idx++;
            } else if (score >= 1) {
                power += tokens[edx];
                edx--;
                score--;
            } else
                break;
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}