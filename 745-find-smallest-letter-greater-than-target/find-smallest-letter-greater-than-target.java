class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1] || target < letters[0])
            return letters[0];
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] == target) {
                while (mid < letters.length - 1 && letters[mid] == letters[mid + 1]) {
                    mid++;
                }
                return letters[mid + 1];
            } else if (target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start];
    }
}