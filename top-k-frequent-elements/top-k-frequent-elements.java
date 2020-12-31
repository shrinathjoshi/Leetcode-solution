class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(k == nums.length)
            return nums;
        
        Map<Integer,Integer> freqMap = new HashMap<>();
        
        for(int num : nums)
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(
            (a,b) -> freqMap.get(a) - freqMap.get(b) 
        );
        
        for(int n :freqMap.keySet()){
            minHeap.add(n);
            if(minHeap.size()>k)
                minHeap.poll();
            
        }
        
        int result[] = new int[k];
        for(int i=k-1;i>=0;i--)
            result[i]=minHeap.poll();
     
        return result;
    }
}
