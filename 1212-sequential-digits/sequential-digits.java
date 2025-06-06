class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String nums = "123456789";
        for (int left = 0; left < nums.length(); left++) {
            for (int right = left + 1; right <= nums.length(); right++) {
                int num = Integer.parseInt(nums.substring(left, right));
                if (num >= low && num <= high)
                    list.add(num);
            }
        }
        list.sort(null);
        return list;
    }
}