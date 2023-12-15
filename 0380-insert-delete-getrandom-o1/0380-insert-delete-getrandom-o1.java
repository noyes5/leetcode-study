class RandomizedSet {
    private final Map<Integer, Integer> indexMap;
    private final List<Integer> elements;
    private final Random random;

    public RandomizedSet() {
        indexMap = new HashMap<>();
        elements = new LinkedList<>();
        random = new Random();
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