class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int [] st = new int[heights.length];
        int top = -1;
        for (int i = heights.length - 1; i >= 0; i--) {
            int height = heights[i], counter = 0;
            while (top > -1 && height >= st[top])
            {
                counter++;
                top--;
            }
            heights[i] = counter + (top <= -1 ? 0 : 1);
            st[++top] = height;
        }
        return heights;
    }
}