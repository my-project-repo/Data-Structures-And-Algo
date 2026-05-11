/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int idx = 0, edx = n, ans = 0;
        while (idx <= edx) {
            int mid = idx + (edx - idx) / 2;
            if (isBadVersion(mid)) {
                ans = mid;
                edx = mid - 1;
            } else
                idx = mid + 1;

        }

        return ans;
    }
}