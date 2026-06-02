class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0, idx = 0, edx = people.length - 1;
        while (idx <= edx) {
            int save = people[idx] + people[edx];
            if (save <= limit) {
                idx++;
            }
            edx--;
            res++;
        }

        return res;
    }
}