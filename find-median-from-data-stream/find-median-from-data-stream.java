class MedianFinder {
    PriorityQueue<Integer> lower ;
    PriorityQueue<Integer> higher ;
    
    /** initialize your data structure here. */
    public MedianFinder() {
        lower = new PriorityQueue<>((a,b)-> b-a);
        higher = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        lower.add(num);
        
        higher.add(lower.remove());
        
        if(lower.size() < higher.size()){
            lower.add(higher.remove());
        }
    }
    
    public double findMedian() {
        if(lower.size() == higher.size())
            return (lower.peek() + higher.peek())*0.5;
        
        return lower.peek();
            
            
    }
}
​
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
