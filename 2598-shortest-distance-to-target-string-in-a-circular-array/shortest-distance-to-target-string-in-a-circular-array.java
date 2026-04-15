class Solution {
    public int closestTarget(String[] words, String target, int x) {
        int n = words.length, idx = n + x, edx = idx, idx2 = x, counter = 0;
        while (idx > x && idx2 < edx) {
            if (words[idx % n].equals(target))
                break;
            if (words[idx2 % n].equals(target))
                break;
            idx--;
            idx2++;
            counter++;
        }
        return counter == n ? -1 : counter;
    }
}