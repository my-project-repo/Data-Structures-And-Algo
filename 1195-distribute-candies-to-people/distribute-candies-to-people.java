class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int k = 0, counter = 1; // k serves as the index of the array
        while (candies > 0) {
            int index = k % num_people;
            if (counter > candies) { // when there are not sufficient candies
                res[index] += candies; // we transfer the remaining candies
                break;
            }
            res[index] += counter; // adding candies to people ; array
            candies -= counter; // current number of candies after giving candies
            counter++; // adding the number of candies to be given by 1
            k++; 
        }
        return res; // finally returning the result array
    }
}