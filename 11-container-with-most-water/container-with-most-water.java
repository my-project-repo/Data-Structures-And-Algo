class Solution {
    public int maxArea(int[] height) {
        int idx = 0, edx = height.length - 1, res = 0;
        while (idx < edx) {
            int min = Math.min(height[idx], height[edx]);
            res = Math.max(res, min * (edx - idx));
            if (height[idx] < height[edx])
                idx++;
            else
                edx--;
        }
        return res;
    }
}