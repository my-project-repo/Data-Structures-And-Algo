class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();

        String nums = "123456789";

        int minLen = (int) Math.log10(low) + 1;
        int maxLen = (int) Math.log10(high) + 1;

        for (int len = minLen; len <= maxLen; len++) {

            int l = 0;

            for (int r = 0; r < nums.length(); r++) {

                while (r - l + 1 > len)
                    l++;

                if (r - l + 1 == len) {
                    int val = Integer.parseInt(nums.substring(l, r + 1));

                    if (val >= low && val <= high)
                        list.add(val);
                }
            }
        }

        return list;
    }
}