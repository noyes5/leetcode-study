class MinStack {
    private int head;
    private int minHead;
    private int[] array;
    private int[] minArray;
    private int capacity;

    public MinStack() {
        head = -1;
        minHead = -1;
        capacity = 3 * 10000;
        array = new int[capacity];
        minArray = new int[capacity];
    }
    
    public void push(int val) {
        if (head == capacity - 1) {
            throw new RuntimeException("Stack Overflow Exception!");
        }

        if (head == -1 || minArray[minHead] >= val) {
            minArray[++minHead] = val;
        }
 
        array[++head] = val;
    }
    
    public void pop() {
        if (head == -1) {
            throw new RuntimeException("Stack Underflow Exception!");
        }

        if (minArray[minHead] == array[head] && minHead != 0) {
            minHead--;
        }

        head--;
    }
    
    public int top() {
        if (head < 0) {
            return -1;
        }
        return array[head];
    }
    
    public int getMin() {
        if (minHead != -1) {
            return minArray[minHead];
        }
        return Integer.MIN_VALUE;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */