class Solution {

    public List<String> findRepeatedDnaSequences(String s) {

        int n = s.length();

        List<String> ans = new ArrayList<>();

        if (n < 10)
            return ans;

        Map<Character, Integer> map = new HashMap<>();

        map.put('A', 1);
        map.put('C', 2);
        map.put('G', 3);
        map.put('T', 4);

        long base = 5;
        long mod = 1000000007;

        long hash = 0;

        long power = 1;

        // base^(9)
        for (int i = 0; i < 9; i++) {
            power = (power * base) % mod;
        }

        // First window hash
        for (int i = 0; i < 10; i++) {

            hash =
                (hash * base + map.get(s.charAt(i))) % mod;
        }

        Set<Long> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        seen.add(hash);

        // Sliding window
        for (int i = 10; i < n; i++) {

            // remove left character
            hash =
                (hash -
                map.get(s.charAt(i - 10)) * power % mod
                + mod) % mod;

            // shift and add new char
            hash =
                (hash * base + map.get(s.charAt(i))) % mod;

            if (seen.contains(hash)) {

                repeated.add(
                    s.substring(i - 9, i + 1)
                );

            } else {

                seen.add(hash);
            }
        }

        ans.addAll(repeated);

        return ans;
    }
}