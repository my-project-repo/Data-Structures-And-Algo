class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int idx = 0, idx1 = 0, edx = nums1.length, edx1 = nums2.length;
        while (idx < edx && idx1 < edx1) {
            if (nums1[idx][0] < nums2[idx1][0]) {
                list.add(new int[] { nums1[idx][0], nums1[idx][1] });
                idx++;
            } else if (nums1[idx][0] > nums2[idx1][0]) {
                list.add(new int[] { nums2[idx1][0], nums2[idx1][1] });
                idx1++;
            } else {
                list.add(new int[] { nums1[idx][0], (nums1[idx][1] + nums2[idx1][1]) });
                idx++;
                idx1++;
            }
        }
        while (idx < edx) {
            list.add(new int[] { nums1[idx][0], nums1[idx][1] });
            idx++;
        }
        while (idx1 < edx1) {
            list.add(new int[] { nums2[idx1][0], nums2[idx1][1] });
            idx1++;
        }

        return list.toArray(new int[list.size()][]);

    }
}