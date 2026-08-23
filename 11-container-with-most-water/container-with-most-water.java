class Solution {
    public int maxArea(int[] height) {
        int max = 0, idx = 0, edx = height.length - 1;
        while (idx < edx) {
            int water = Math.min(height[idx], height[edx]) * (edx - idx);
            max = Math.max(max, water);
            if (height[idx] > height[edx])
                edx--;
            else
                idx++;
        }

        return max;
    }
}