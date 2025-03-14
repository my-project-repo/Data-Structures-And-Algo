class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length==1) return nums;
        int[] res = new int[k];
        PriorityQueue<Max> heap = new PriorityQueue<>(Comparator.comparingInt(Max::getCount).reversed());
        int p = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            heap.offer(new Max(key, map.get(key)));
        }
        while (k-- > 0 && !heap.isEmpty()) {
            res[p++] = heap.poll().num;
        }
        return res;

    }
}

class Max {
    int num;
    int count;

    Max(int num, int count) {
        this.num = num;
        this.count = count;
    }

    int getCount() {
        return this.count;
    }
}