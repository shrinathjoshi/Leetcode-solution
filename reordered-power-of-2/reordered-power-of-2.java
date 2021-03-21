class Solution {
    public boolean reorderedPowerOf2(int N) {
        long result =  countFreq(N);
        
        for(int i=0;i<32;i++){
            if(countFreq(1<<i) == result)
                return true;
        }
    
        return false;
    }
    
    private long countFreq(int N){
        long freq = 0;
        
        while(N>0){
            freq+=(long)Math.pow(10,N%10);
            N=N/10;
        }
        
        return freq;
    }
}