class RandomizedSet {
    private final Map<Integer, Integer> indexMap;
    private final List<Integer> elements;
    private final Random random = new Random();

    public RandomizedSet() {
        indexMap = new HashMap<>();
        elements = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (indexMap.containsKey(val)) { 
            return false;
        }
        indexMap.put(val, elements.size());
        elements.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }
        int valIndex = indexMap.get(val);
        int lastIndex = elements.size() - 1;

        int lastValue = elements.get(lastIndex);
        elements.set(valIndex, lastValue);
        indexMap.put(lastValue, valIndex);

        indexMap.remove(val);
        elements.remove(lastIndex);
        return true;
    }
    
    public int getRandom() {
        return elements.get(random.nextInt(elements.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */