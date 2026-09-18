class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        List<int[]> list = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        // first and last index of each character
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (first[ch - 'a'] == -1)
                first[ch - 'a'] = i;

            last[ch - 'a'] = i;
        }

        for (int i = 0; i < 26; i++) {
            if (first[i] == -1)
                continue;

            int start = first[i];
            int end = last[i];
            boolean flag = true;
            for (int j = start; j <= end; j++) // checking in between
            {
                int idx = s.charAt(j) - 'a';
                if (first[idx] < start)
                {
                    flag = false;
                    break;
                } 

                if (last[idx] > end)
                end = last[idx];
            }

            if (flag)
                list.add(new int[] { start, end });
        }

        // sorting based on interval ending
        list.sort((a, b) -> {
            if (a[1] == b[1])
                return Integer.compare(a[1] - a[0], b[1] - b[0]);
            return Integer.compare(a[1], b[1]);
        });

        int prevEnd = -1;
        for (int[] curr : list) {
            int start = curr[0];
            int end = curr[1];
            if (start > prevEnd) {
                ans.add(s.substring(start, end + 1));
                prevEnd = end;
            }
        }

        return ans;

    }
}