class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int k = 0, counter = 1;
        while (candies > 0) {
            int index = k % num_people;
            if (counter <= candies) {
                res[index] += counter;
            } else
                res[index] += candies;
            candies -= counter;
            counter++;
            k++;
        }
        return res;
    }
}