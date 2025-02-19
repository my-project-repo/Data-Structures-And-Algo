import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequent(int[] nums, int key) {
        int max = -99, maxDigit = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                freq.put(nums[i + 1], freq.getOrDefault(nums[i + 1], 0) + 1);
                if (freq.get(nums[i + 1]) > max) {
                    max = freq.get(nums[i + 1]);
                    maxDigit = nums[i + 1];
                }
            }
        }
        return maxDigit;
    }

}