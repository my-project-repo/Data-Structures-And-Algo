class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int m = queries.length, p = 0;
        int[] res = new int[m];
        for (int i : queries) {
            res[p++] = find(i, nums);
        }
        return res;
    }

    int find(int val, int[] nums) {
        int counter = 0,sum = 0;
        for (int i : nums) {
            sum += i;
            if (sum <= val)
                counter++;
            else
                break;
        }
        return counter;
    }
}