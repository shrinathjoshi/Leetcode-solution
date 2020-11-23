class OrderedStream {
​
    private String orderedStreamArray[];
    private int currentPointer=0;
    public OrderedStream(int n) {
        orderedStreamArray = new String[n];
    }
    
    public List<String> insert(int id, String value) {
        orderedStreamArray[id-1] = value;
        
        ArrayList<String> result = new ArrayList<>();
        
        while(currentPointer<orderedStreamArray.length && orderedStreamArray[currentPointer] != null){
            result.add(orderedStreamArray[currentPointer++]);
        }
        
        return result;
    }
}
​
/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(id,value);
 */
