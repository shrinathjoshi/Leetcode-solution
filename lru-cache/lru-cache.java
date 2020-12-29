        
        if(map.containsKey(key)){
            queue.remove(key);
            queue.addFirst(key);
            
            return map.get(key).getValue();
        }
        
        return -1;
    }
    
    public void put(int key, int value) {
        
         if(map.containsKey(key)){
            queue.remove(key);
        }
        else 
        if(queue.size() == size){
            map.remove(queue.removeLast());
        }
        
       
        
        CacheEntry newEntry = new CacheEntry(key,value);
        map.put(key,newEntry);
        queue.addFirst(key);
    }
}
​
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
