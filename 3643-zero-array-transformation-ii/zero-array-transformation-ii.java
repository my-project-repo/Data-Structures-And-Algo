class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int left = 0, right = queries.length, ans = -1;
        int n = nums.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;  
            
            if (canMakeZero(nums.clone(), queries, mid)) {
                ans = mid;  
                right = mid - 1;
            } else {
                left = mid + 1;  
            }
        }

        return ans;  
    }

    
    private boolean canMakeZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] diff = new int[n + 1];  

        
        for (int i = 0; i < k; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int val = queries[i][2];

            diff[l] -= val;
            if (r + 1 < n) {
                diff[r + 1] += val;
            }
        }

        int current = 0;
        for (int i = 0; i < n; i++) {
            current += diff[i];
            nums[i] += current;  
            if (nums[i] > 0) return false;  
        }

        return true;  
    }
}