class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // 4 5 8  1 8 9 10 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int j = 0, e2 = arr2.length, ans = 0;
        for (int i : arr1) {
            while (j < e2 && arr2[j] < i - d)
                j++;

            if (j == e2 || (arr2[j] > i + d))
                ans++;
        }
        return ans;
    }
}