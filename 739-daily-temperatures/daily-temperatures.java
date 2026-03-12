class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int [] res = new int[tem.length];
        int [] st = new int [tem.length];
        int top = -1;
        for (int i = tem.length - 1; i >= 0; i--) {
            while (top >= 0 && tem[i] >= tem[st[top]] )
            top--;

            res[i] = top < 0 ? 0 : st[top] - i;
            st[++top] = i;
        }
        return res;
    }
}