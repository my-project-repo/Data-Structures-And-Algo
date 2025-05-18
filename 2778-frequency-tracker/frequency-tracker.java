class FrequencyTracker {
    Map<Integer, Integer> map;
    Map<Integer, Integer> mapFreq;

    public FrequencyTracker() {
        map = new HashMap<>();
        mapFreq = new HashMap<>();
    }

    public void add(int number) {
        int oldCount = map.getOrDefault(number, 0);
        int newCount = oldCount + 1;
        map.put(number, newCount);
        mapFreq.put(oldCount, mapFreq.getOrDefault(oldCount, 0) - 1);
        mapFreq.put(newCount, mapFreq.getOrDefault(newCount, 0) + 1);
    }

    public void deleteOne(int number) {
        if (!map.containsKey(number))return;
        int oldcount = map.get(number);
        int newcount = oldcount - 1;
        mapFreq.put(oldcount, mapFreq.getOrDefault(oldcount, 0) - 1);
        if (mapFreq.get(oldcount) == 0) {
            mapFreq.remove(oldcount);
        }
        if (newcount == 0) {
            map.remove(number);
        } else {
            map.put(number, newcount);
            mapFreq.put(newcount, mapFreq.getOrDefault(newcount, 0) + 1);
        }
    }

    public boolean hasFrequency(int frequency) {
        return mapFreq.getOrDefault(frequency, 0) > 0;
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */
/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */