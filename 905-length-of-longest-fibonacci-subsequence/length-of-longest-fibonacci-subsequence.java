import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int counter = 0, max = -99;
        for (int i : arr)
            set.add(i);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int first = arr[i];
                int second = arr[j];
                int sum = first + second;
                counter = 2;
                while (set.contains(sum)) {
                    first = second;
                    second = sum;
                    counter++;
                    sum = first + second;
                }
                max = Math.max(max, counter);
            }
        }
        return max == 2 ? 0 : max;

    }
}