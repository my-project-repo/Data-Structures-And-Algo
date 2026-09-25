class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer , List<Integer>> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            map.computeIfAbsent(nums[i] , k -> new ArrayList<>()).add(i);
        }

        int answer = 0;

        for(List<Integer> indexes : map.values()){
            if(indexes.size() < 3){
                continue;
            }

            int gap = indexes.get(1) - indexes.get(0);//gap calculation

            boolean special = true;

            //check for the remaining gaps
            for(int i = 2 ; i < indexes.size() ; i++){
                int currentGap = indexes.get(i) - indexes.get(i - 1);

                if(currentGap != gap){
                    special = false;
                    break;
                }
            }
            if(special){
                answer++;
            }
        }
        return answer;
    }
}