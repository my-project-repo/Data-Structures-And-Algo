class Solution {
    public int maxArea(int[] height) {
        int idx = 0, edx = height.length - 1, max = 0;
        while (idx < edx) {
            int min = Math.min(height[idx], height[edx]);
            max = Math.max(max, min * (edx - idx));
            if (height[idx] < height[edx])
                idx++;
            else if (height[idx] > height[edx])
                edx--;
            else {
                idx++;
                edx--;
            }
        }
        return max;
    }
}