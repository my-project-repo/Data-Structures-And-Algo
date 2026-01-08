class Solution {
    public int[] sortByBits(int[] arr) {
        Integer [] ar = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(ar,(a,b)->
        {
            int val = Integer.bitCount(a);
            int val2 = Integer.bitCount(b);
            return val == val2 ? a-b : val - val2;
        });
        for (int i = 0;i<arr.length;i++) arr[i] = ar[i];
       return arr;
    }
}