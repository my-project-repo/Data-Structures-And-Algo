class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder ans = new StringBuilder();
        PriorityQueue<int[]> max = new PriorityQueue<>((x, y) -> Integer.compare(y[1], x[1]));
        if (a > 0)
            max.add(new int[] { 0, a });
        if (b > 0)
            max.add(new int[] { 1, b });
        if (c > 0)
            max.add(new int[] { 2, c });

        while (!max.isEmpty()) {
            int[] curr = max.poll();
            char ch = (char) (curr[0] + 'a');
            if (ans.length() >= 2 && ans.charAt(ans.length() - 1) == ch && ans.charAt(ans.length() - 2) == ch) {

                if (max.isEmpty())
                    break;
                int[] sec = max.poll();
                char ch2 = (char) (sec[0] + 'a');

                ans.append(ch2);
                sec[1]--;
                if (sec[1] > 0)
                    max.add(sec);
                max.add(curr);
            } else {
                ans.append(ch);
                curr[1]--;

                if (curr[1] > 0)
                    max.add(curr);
            }

        }

        return ans.toString();

    }
}