class FreqStack {
    
    int maxFreq;
    Map<Integer,Integer> freqMap;
    Map<Integer, Stack<Integer>> groupMap;
    
    public FreqStack() {
        maxFreq = 0;
        freqMap = new HashMap<>();
        groupMap = new HashMap<>();
    }
    
    public void push(int val) {
        int freq = freqMap.getOrDefault(val,0)+1;
        freqMap.put(val,freq);
        
        if(freq > maxFreq) maxFreq = freq;
        
        groupMap.computeIfAbsent(freq, z -> new Stack()).push(val);
    }
    
    public int pop() {
        int val = groupMap.get(maxFreq).pop();
        
        if(groupMap.get(maxFreq).isEmpty()) --maxFreq;
        
        freqMap.put(val,freqMap.get(val)-1);
        
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */