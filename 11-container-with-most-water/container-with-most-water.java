class Solution {
    public int maxArea(int[] height) {
        int max = 0, idx = 0, edx = height.length - 1;
        while (idx < edx) {
            int min = Math.min(height[idx], height[edx]);
            max = Math.max(max, min * (edx - idx));
            if (height[idx] > height[edx])
                edx--;
            else 
                idx++;
        }
        return max;
    }
}